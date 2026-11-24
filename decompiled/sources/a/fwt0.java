package a;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fwt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReentrantLock f10277a;
    public static final Condition b;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f10277a = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        b = conditionNewCondition;
    }

    public static void a() {
        try {
            ReentrantLock reentrantLock = f10277a;
            reentrantLock.lock();
            try {
                b.await();
            } finally {
                reentrantLock.unlock();
            }
        } catch (InterruptedException unused) {
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = f10277a;
        reentrantLock.lock();
        try {
            b.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
