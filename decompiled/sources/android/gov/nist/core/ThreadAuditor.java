package android.gov.nist.core;

import a.brm0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ThreadAuditor {
    private Map<Thread, ThreadHandle> threadHandles = new ConcurrentHashMap();
    private long pingIntervalInMillisecs = 0;

    public class ThreadHandle {
        private ThreadAuditor threadAuditor;
        private boolean isThreadActive = false;
        private Thread thread = Thread.currentThread();

        public ThreadHandle(ThreadAuditor threadAuditor) {
            this.threadAuditor = threadAuditor;
        }

        public long getPingIntervalInMillisecs() {
            return this.threadAuditor.getPingIntervalInMillisecs();
        }

        public Thread getThread() {
            return this.thread;
        }

        public boolean isThreadActive() {
            return this.isThreadActive;
        }

        public void ping() {
            this.threadAuditor.ping(this);
        }

        public void setThreadActive(boolean z) {
            this.isThreadActive = z;
        }

        public String toString() {
            return "Thread Name: " + this.thread.getName() + ", Alive: " + this.thread.isAlive();
        }
    }

    public ThreadHandle addCurrentThread() {
        ThreadHandle threadHandle = new ThreadHandle(this);
        if (isEnabled()) {
            this.threadHandles.put(Thread.currentThread(), threadHandle);
        }
        return threadHandle;
    }

    public String auditThreads() {
        String string = null;
        for (ThreadHandle threadHandle : this.threadHandles.values()) {
            if (!threadHandle.isThreadActive()) {
                Thread thread = threadHandle.getThread();
                if (string == null) {
                    string = "Thread Auditor Report:\n";
                }
                StringBuilder sbT = brm0.t(string, "   Thread [");
                sbT.append(thread.getName());
                sbT.append("] has failed to respond to an audit request.\n");
                string = sbT.toString();
            }
            threadHandle.setThreadActive(false);
        }
        return string;
    }

    public long getPingIntervalInMillisecs() {
        return this.pingIntervalInMillisecs;
    }

    public boolean isEnabled() {
        return this.pingIntervalInMillisecs > 0;
    }

    public void ping(ThreadHandle threadHandle) {
        threadHandle.setThreadActive(true);
    }

    public void removeThread(Thread thread) {
        this.threadHandles.remove(thread);
    }

    public void reset() {
        this.threadHandles.clear();
    }

    public void setPingIntervalInMillisecs(long j) {
        this.pingIntervalInMillisecs = j;
    }

    public synchronized String toString() {
        String str;
        str = "Thread Auditor - List of monitored threads:\n";
        Iterator<ThreadHandle> it = this.threadHandles.values().iterator();
        while (it.hasNext()) {
            str = str + "   " + it.next().toString() + Separators.RETURN;
        }
        return str;
    }
}
