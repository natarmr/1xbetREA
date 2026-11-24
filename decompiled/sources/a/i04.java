package a;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class i04 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13932a = 1;

    public /* synthetic */ i04(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f13932a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = j04.j;
                reentrantLock.lock();
                try {
                    j04 j04VarI = zgc.I();
                    if (j04VarI == j04.i) {
                        j04.i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (j04VarI != null) {
                            j04VarI.k();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
        }
    }

    public /* synthetic */ i04(String str) {
        super(str);
    }

    public /* synthetic */ i04(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
