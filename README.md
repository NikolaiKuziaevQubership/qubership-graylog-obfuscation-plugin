# Graylog-Obfuscation-Plugin

Plugin for automatic analysis and obfuscation input log messages

## Development
Before push your commits and create PR run linters and test.
* SuperLinter
```shell
docker run \
  -e RUN_LOCAL=true \
  -e DEFAULT_BRANCH=$(git rev-parse --abbrev-ref HEAD) \
  --env-file .github/super-linter.env \
  -v ${PWD}:/tmp/lint \
  --rm \
  ghcr.io/super-linter/super-linter:slim-$(sed -nE 's#.*uses:\s+super-linter/super-linter/slim@([^\s]+).*#\1#p' .github/workflows/super-linter.yaml)
```
