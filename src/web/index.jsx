import {PluginManifest, PluginStore} from 'graylog-web-plugin/plugin';
import {ObfuscationConfiguration} from "pages/ObfuscationConfiguration";
import packageJson from '../../package.json';

PluginStore.register(new PluginManifest(packageJson, {
    /* This is the place where you define which entities you are providing to the web interface.
       Right now you can add routes and navigation elements to it.
       Examples: */

    // Adding a route to /sample, rendering YourReactComponent when called:

    systemConfigurations: [
        {
            component: ObfuscationConfiguration
        },
    ],
}));