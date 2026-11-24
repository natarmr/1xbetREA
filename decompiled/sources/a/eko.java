package a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class eko implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7962a;
    public final Object b;

    public eko(wrw0 wrw0Var) {
        this.f7962a = (byte) 1;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.f7962a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new dko(runnable, (byte) 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread;
            default:
                Thread threadNewThread2 = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread2.setName("ScionFrontendApi");
                return threadNewThread2;
        }
    }

    public eko(AtomicLong atomicLong) {
        this.f7962a = (byte) 0;
        this.b = atomicLong;
    }
}
