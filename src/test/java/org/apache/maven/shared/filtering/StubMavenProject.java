package org.apache.maven.shared.filtering;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.util.Properties;

import org.apache.maven.project.MavenProject;

/**
 * @author Olivier Lamy
 * @since 1.0-beta-1
 * @version $Id: StubMavenProject.java 1632611 2014-10-17 15:36:52Z khmarbaise $
 */
public class StubMavenProject
    extends MavenProject
{
    private Properties properties;

    private File basedir;

    protected StubMavenProject( File basedir )
    {
        this.basedir = basedir;
    }

    public Properties getProperties()
    {
        return this.properties;
    }

    public void setProperties( Properties properties )
    {
        this.properties = properties;
    }

    public void addProperty( String key, String value )
    {
        if ( this.properties == null )
        {
            this.properties = new Properties();
        }
        this.properties.put( key, value );
    }

    public File getBasedir()
    {
        return basedir;
    }

}
