/*
 * Copyright 2012 b1.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.b1.pack.cli;

import com.google.common.base.Objects;
import org.b1.pack.api.builder.BuilderProvider;

public class FsBuilderProvider extends BuilderProvider {

    private final long maxVolumeSize;

    public FsBuilderProvider(Long maxVolumeSize) {
        this.maxVolumeSize = Objects.firstNonNull(maxVolumeSize, Long.MAX_VALUE);
    }

    @Override
    public long getMaxVolumeSize() {
        return maxVolumeSize;
    }
}
