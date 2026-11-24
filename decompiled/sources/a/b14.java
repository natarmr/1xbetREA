package a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b14 {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(b14.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f1789a;

    public final String toString() {
        return String.valueOf(this.f1789a);
    }
}
