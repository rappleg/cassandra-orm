/*
 * Copyright 2012 ReachLocal Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reachlocal.grails.plugins.cassandra.test.orm

/**
 * @author: Bob Florian
 */
class UserGroupPost 
{
	UUID uuid = UUID.timeUUID()
	String text
	String formContent
	UserGroup userGroup

	static belongsTo = [userGroup: UserGroup]

	static cassandraMapping = [
			cluster: 'mockCluster',
			unindexedPrimaryKey: 'uuid',
			timeToLive: [formContent: 48 * 3600]
	]
}
