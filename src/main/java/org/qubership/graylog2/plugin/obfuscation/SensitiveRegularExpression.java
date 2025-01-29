package org.qubership.graylog2.plugin.obfuscation;

import org.qubership.graylog2.plugin.obfuscation.search.Finder;
import org.qubership.graylog2.plugin.obfuscation.search.RegularExpressionSensitiveDataSearcher;

import java.util.regex.Pattern;

public class SensitiveRegularExpression extends RegularExpression implements Finder {

    private final int importance;

    public SensitiveRegularExpression(int id, String name, Pattern pattern, int importance) {
        super(id, name, pattern);
        this.importance = importance;
    }

    @Override
    public String getFullName() {
        return getSearchType() + "#" + getName();
    }

    @Override
    public int getImportance() {
        return importance;
    }

    @Override
    public String getSearchType() {
        return RegularExpressionSensitiveDataSearcher.SEARCH_TYPE;
    }
}