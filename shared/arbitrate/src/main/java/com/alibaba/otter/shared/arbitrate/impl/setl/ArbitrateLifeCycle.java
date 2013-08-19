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

package com.alibaba.otter.shared.arbitrate.impl.setl;

/**
 * @author jianghang 2011-9-20 下午01:05:24
 * @version 4.0.0
 */
public abstract class ArbitrateLifeCycle {

    private Long             pipelineId;
    private volatile boolean stop = false; //是否关闭

    public ArbitrateLifeCycle(Long pipelineId){
        this.pipelineId = pipelineId;
    }

    public Long getPipelineId() {
        return pipelineId;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void destory() {
        stop = true;
    }
}
