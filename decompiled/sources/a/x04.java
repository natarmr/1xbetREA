package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class x04 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(x04.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f40052a;

    public final boolean a() {
        return b.compareAndSet(this, 0, 1);
    }

    public final boolean b() {
        return this.f40052a != 0;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
