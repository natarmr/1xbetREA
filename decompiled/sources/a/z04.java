package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class z04 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(z04.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f43546a;

    public final int a() {
        return b.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.f43546a);
    }
}
