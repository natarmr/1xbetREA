package a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class n950 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23122a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public n950(String str) {
        this.f23122a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.b.newThread(new btg0(runnable, (byte) 3));
        threadNewThread.setName(this.f23122a);
        return threadNewThread;
    }
}
