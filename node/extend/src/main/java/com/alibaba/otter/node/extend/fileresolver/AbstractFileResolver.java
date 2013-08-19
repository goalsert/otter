/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.alibaba.otter.node.extend.fileresolver;

import com.alibaba.otter.shared.etl.extend.fileresolver.FileResolver;

/**
 * @author jianghang 2012-10-23 下午04:11:14
 * @version 4.1.0
 */
public abstract class AbstractFileResolver implements FileResolver {

    public boolean isDeleteRequired() {
        return false;
    }

    public boolean isDistributed() {
        return false;
    }
}
