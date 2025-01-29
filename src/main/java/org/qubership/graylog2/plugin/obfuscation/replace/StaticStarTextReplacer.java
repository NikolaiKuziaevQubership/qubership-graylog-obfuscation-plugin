package org.qubership.graylog2.plugin.obfuscation.replace;

import org.qubership.graylog2.plugin.obfuscation.search.Finder;

public class StaticStarTextReplacer implements TextReplacer {

    public static final String OBFUSCATED = "********";

    public static final String NAME = "Static Star Replacer";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getExample() {
        return OBFUSCATED;
    }

    @Override
    public String replace(String sourceText, Finder finder) {
        return OBFUSCATED;
    }
}