package android.gov.nist.javax.sip;

import a.ap10;
import a.jf4;
import a.uuz;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class MDCScheduledTHExecutor extends ScheduledThreadPoolExecutor implements AutoCloseable {
    private static final String AFFINITY_THREAD_VAR = "AffTh";
    private static StackLogger logger = CommonLogger.getLogger(MDCScheduledTHExecutor.class);

    public MDCScheduledTHExecutor(int i) {
        super(i);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (logger.isLoggingEnabled(16) && (runnable instanceof MDCFuture)) {
            Runnable runnable2 = ((MDCFuture) runnable).runnable;
            if (runnable2 instanceof MDCTask) {
                Map<String, String> mDCVars = ((MDCTask) runnable2).getMDCVars();
                if (mDCVars == null) {
                    if (ap10.f1228a != null) {
                        return;
                    }
                    jf4.n("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                    return;
                }
                Iterator<String> it = mDCVars.keySet().iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        uuz uuzVar = ap10.f1228a;
                        jf4.o("key parameter cannot be null");
                        return;
                    } else if (ap10.f1228a == null) {
                        jf4.n("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (logger.isLoggingEnabled(16) && (runnable instanceof MDCFuture)) {
            Runnable runnable2 = ((MDCFuture) runnable).runnable;
            if (runnable2 instanceof MDCTask) {
                MDCTask mDCTask = (MDCTask) runnable2;
                Map<String, String> mDCVars = mDCTask.getMDCVars();
                if (mDCVars != null) {
                    for (String str : mDCVars.keySet()) {
                        String str2 = mDCVars.get(str);
                        if (str2 != null) {
                            str2.toString();
                            if (str == null) {
                                uuz uuzVar = ap10.f1228a;
                                jf4.o("key parameter cannot be null");
                                return;
                            } else if (ap10.f1228a == null) {
                                jf4.n("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                                return;
                            }
                        } else if (str == null) {
                            uuz uuzVar2 = ap10.f1228a;
                            jf4.o("key parameter cannot be null");
                            return;
                        } else if (ap10.f1228a == null) {
                            jf4.n("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                            return;
                        }
                    }
                } else if (mDCTask.getThreadHash() != null) {
                    Object threadHash = mDCTask.getThreadHash();
                    if (threadHash != null) {
                        threadHash.toString();
                        if (ap10.f1228a == null) {
                            jf4.n("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                            return;
                        }
                    } else if (ap10.f1228a == null) {
                        jf4.n("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                        return;
                    }
                }
            }
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new MDCFuture(runnable, runnableScheduledFuture);
    }

    public MDCScheduledTHExecutor(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    public MDCScheduledTHExecutor(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, rejectedExecutionHandler);
    }

    public class MDCFuture<V> implements RunnableScheduledFuture<V> {
        boolean done = false;
        Runnable runnable;
        RunnableScheduledFuture<V> task;

        public MDCFuture(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
            this.task = runnableScheduledFuture;
            this.runnable = runnable;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.task.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.task.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return this.task.getDelay(timeUnit);
        }

        public Runnable getRunnable() {
            return this.runnable;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.task.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.task.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return this.task.isPeriodic();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.task.run();
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            return this.task.compareTo(delayed);
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) {
            return this.task.get(j, timeUnit);
        }
    }

    public MDCScheduledTHExecutor(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
    }
}
