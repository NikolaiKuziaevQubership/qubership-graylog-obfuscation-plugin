# Obfuscation Plugin Development

Obfuscation plugin consists of two parts

1. Backend part written on java
2. Frontend part written on React

For build plugin you should install:

1. yarn, version 1.22.0 or higher
2. nodejs, version 12.16.1 or higher
(Lower versions also can work, but the build was performed with directly these versions)

Also, for build of plugin require `graylog2-server` sources

1. Download graylog sources from [https://github.com/Graylog2/graylog2-server/tree/3.1.4](https://github.com/Graylog2/graylog2-server/tree/3.1.4)
2. Extract plugin sources to directory nearby with plugin
3. Rename source directory to graylog2-server
4. You directories should be like

    ```bash
    ../graylog-obfuscation-plugin
    ../graylog2-server
    ```

5. Go to graylog2-server/graylog2-web-interface
6. Update yarn.lock file
7. Run in command line the following commands:

   ```bash
   yarn install
   yarn run build
   ```

    > **Note:**
    >
    > If you run build on windows then go to `package.json` file,
    > find section "scripts", "build" and add "env" at the beginning of line.
    > You should get something like `build`:
    >
    > ```bash
    > env disable_plugins=true webpack --config webpack.bundled.js`
    > ```

8. If steps was completed successfully, then you can build the plugin.
Go to /graylog-obfuscation-plugin and run `mvn clean install` for build.

If build was successful, you are amazing

Russian documentation for React framework: [https://react.dev/learn](https://react.dev/learn)