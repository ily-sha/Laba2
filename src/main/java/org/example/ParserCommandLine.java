package org.example;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.util.ArrayList;
import java.util.List;

public class ParserCommandLine {

    @Option(name = "-o", metaVar = "fileName")
    private String outputName;
    public String getOutputName() {
        return outputName;
    }




    @Option(name = "-u")
    private Boolean isOnlyUniqueOutput;
    public Boolean getOnlyUniqueOutput() {
        return isOnlyUniqueOutput;
    }

    @Option(name = "-s")
    private Integer countOfFirstCharsIgnoring;

    public Integer getCountOfFirstCharsIgnoring() {
        return countOfFirstCharsIgnoring;
    }

    @Argument
    private List<String> arguments = new ArrayList<String>();

    public List<String> getArguments() {
        return arguments;
    }

    @Option(name = "-i", required = true)
    private boolean isIgnoreTitleCaseOfCharacter;

    public boolean getIgnoreTitleCaseOfCharacter() {
        return isIgnoreTitleCaseOfCharacter;
    }

    public ParserCommandLine(String[] args) {
        CmdLineParser parser = new CmdLineParser(args);
        try {
            parser.parseArgument(args);
            System.out.println(parser.getOptions());
        } catch (CmdLineException e){
            e.printStackTrace();
        }
    }
}
