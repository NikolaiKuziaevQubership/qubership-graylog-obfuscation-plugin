# Graylog Obfuscation Plugin Overview

Graylog obfuscation plugin is separated by two pars:

1. Obfuscation Engine
2. Graylog Integration

## Obfuscation Engine

Obfuscation Engine is technology for searching and obfuscation sensitive data in plain text.
At now, it supported only regular expressions. The configuration of obfuscation engine is stored in Mongo database.

## Graylog Integration

The system allows extent the graylog functionality and obfuscate all or parts of input logs.
The Graylog-Obfuscation-Plugin used the MessageProcessor for integrate with log messages pipeline.
