package io.prometheus.wls.rest;
/*
 * Copyright (c) 2017 Oracle and/or its affiliates
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at http://oss.oracle.com/licenses/upl.
 */

/**
 * @author Russell Gold
 */
class DemoInputs {
    @SuppressWarnings("unused")
    static final String YAML_STRING = "---\n" +
            "startDelaySeconds: 5\n" +
            "host: localhost\n" +
            "port: 7001\n" +
            "username: system\n" +
            "password: gumby1234\n" +
            "\n" +
            "queries:\n" +
            "- serverRuntimes:\n" +
            "    key: name\n" +
            "    keyName: location\n" +
            "    applicationRuntimes:\n" +
            "      key: name\n" +
            "      keyName: application\n" +
            "      componentRuntimes:\n" +
            "        type: WebAppComponentRuntime\n" +
            "        prefix: webapp_config_\n" +
            "        key: name\n" +
            "        values: [deploymentState, contextRoot, sourceInfo, openSessionsHighCount, openSessionsCurrentCount, sessionsOpenedTotalCount]\n" +
            "        servlets:\n" +
            "          prefix: weblogic_servlet_\n" +
            "          key: servletName\n" +
            "          values: invocationTotalCount\n";

    @SuppressWarnings("unused")
    static final String YAML_STRING2 = "---\n" +
            "startDelaySeconds: 5\n" +
            "host: localhost\n" +
            "port: 7001\n" +
            "username: system\n" +
            "password: gumby1234\n" +
            "queries:\n" +
            "- applicationRuntimes:\n" +
            "    key: name\n" +
            "    keyName: app\n" +
            "    componentRuntimes:\n" +
            "      type: WebAppComponentRuntime\n" +
            "      prefix: webapp_config_\n" +
            "      key: name\n" +
            "      values: [deploymentState, contextRoot, sourceInfo, openSessionsHighCount, openSessionsCurrentCount, sessionsOpenedTotalCount]\n" +
            "      servlets:\n" +
            "        prefix: weblogic_servlet_\n" +
            "        key: servletName\n" +
            "        values: invocationTotalCount\n";

    @SuppressWarnings("unused")
    static final String YAML_STRING3 = "---\n" +
            "queries:\n" +
            "- key: name\n" +
            "  keyName: location\n" +
            "  prefix: server_\n" +
            "  applicationRuntimes:\n" +
            "    key: name\n" +
            "    keyName: app\n" +
            "    componentRuntimes:\n" +
            "      type: WebAppComponentRuntime\n" +
            "      prefix: webapp_config_\n" +
            "      key: name\n" +
            "      values: [deploymentState, contextRoot, sourceInfo, openSessionsHighCount, openSessionsCurrentCount, sessionsOpenedTotalCount]\n" +
            "      servlets:\n" +
            "        prefix: weblogic_servlet_\n" +
            "        key: servletName\n" +
            "        values: invocationTotalCount";

    static final String YAML_EMPTY = "---\n";

    private static final char SINGLE_QUOTE = '\'';
    private static final char DOUBLE_QUOTE = '"';


    // This lets us simplify the creation of string to match the full request. All white space is removed and
    // single quotes are converted to double quotes, to match the actual format generated by Gson.
    static String compressedJsonForm(String jsonRequest) {
        StringBuilder sb = new StringBuilder();
        for (char c : jsonRequest.toCharArray())
            sb.append(c == SINGLE_QUOTE ? DOUBLE_QUOTE : c);

        return sb.toString();
    }

    static final String RESPONSE =
                    "{'serverRuntimes': {'items': [{\n" +
                    "    'name': 'ejb30mtflexadmin',\n" +
                    "    'applicationRuntimes': {'items': [\n" +
                    "        {\n" +
                    "            'internal': false,\n" +
                    "            'name': 'mbeans',\n" +
                    "            'componentRuntimes': {'items': [{\n" +
                    "                'deploymentState': 2,\n" +
                    "                'name': 'EjbStatusBean',\n" +
                    "                'type': 'EJBComponentRuntime'\n" +
                    "              }]}\n" +
                    "        },\n" +
                    "        {\n" +
                    "            'internal': true,\n" +
                    "            'name': 'weblogic',\n" +
                    "            'componentRuntimes': {'items': [{\n" +
                    "                'type': 'WebAppComponentRuntime',\n" +
                    "                'sourceInfo': 'weblogic.war',\n" +
                    "                'contextRoot': '\\/weblogic',\n" +
                    "                'openSessionsCurrentCount': 4,\n" +
                    "                'deploymentState': 2,\n" +
                    "                'sessionsOpenedTotalCount': 50,\n" +
                    "                'name': 'ejb30_weblogic',\n" +
                    "                'openSessionsHighCount': 25,\n" +
                    "                'servlets': {'items': [\n" +
                    "                    {\n" +
                    "                        'servletName': 'JspServlet',\n" +
                    "                        'invocationTotalCount': 0\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        'servletName': 'FileServlet',\n" +
                    "                        'invocationTotalCount': 1\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        'servletName': 'ready',\n" +
                    "                        'invocationTotalCount': 2\n" +
                    "                    }\n" +
                    "                  ]}\n" +
                    "              }]}\n" +
                    "        }\n" +
                    "      ]}\n" +
                    "}]}}";
}
