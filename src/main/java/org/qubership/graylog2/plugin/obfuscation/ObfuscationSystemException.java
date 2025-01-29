package org.qubership.graylog2.plugin.obfuscation;

public class ObfuscationSystemException extends RuntimeException {

    public ObfuscationSystemException(String message) {
        super(message);
    }

    public ObfuscationSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}