package a;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class be60 {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f2433a = new ReentrantLock();
    public final k050 e = new k050();

    public be60(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
