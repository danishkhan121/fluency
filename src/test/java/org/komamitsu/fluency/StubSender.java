/*
 * Copyright 2018 Mitsunori Komatsu (komamitsu)
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

package org.komamitsu.fluency;

import org.komamitsu.fluency.ingester.sender.fluentd.FluentdSender;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

public class StubSender
        extends FluentdSender
{
    public StubSender()
    {
        super(new FluentdSender.Config());
    }

    @Override
    public boolean isAvailable()
    {
        return true;
    }

    @Override
    protected void sendInternal(List<ByteBuffer> buffers, byte[] ackToken)
            throws IOException
    {
    }

    @Override
    public void close()
            throws IOException
    {
    }
}
