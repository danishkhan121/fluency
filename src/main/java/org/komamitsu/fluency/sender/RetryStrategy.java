package org.komamitsu.fluency.sender;

abstract class RetryStrategy
{
    abstract long getOriginalNextIntervalMillis(RetryInterval retryInterval, int retryCount);

    public long getNextIntervalMillis(RetryInterval retryInterval, int retryCount)
    {
        long interval = getOriginalNextIntervalMillis(retryInterval, retryCount);
        return retryInterval.getNextIntervalMillis(interval);
    }
}