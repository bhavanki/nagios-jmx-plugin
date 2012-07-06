/*
 *  Copyright 2009-2011 Felix Roethenbacher
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ch.syabru.nagios;

/**
 * Nagios JMX plugin exception.
 *
 * @author Felix Roethenbacher
 *
 */
public class NagiosJmxPluginException extends Exception {

    private static final long serialVersionUID = -2700585651949336674L;

    /**
     * C'tor.
     */
    public NagiosJmxPluginException() {
        super();
    }

    /**
     * C'tor.
     * @param message Message.
     * @param cause Cause.
     */
    public NagiosJmxPluginException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * C'tor.
     * @param message Message.
     */
    public NagiosJmxPluginException(String message) {
        super(message);
    }

    /**
     * C'tor.
     * @param cause Cause.
     */
    public NagiosJmxPluginException(Throwable cause) {
        super(cause);
    }

}
