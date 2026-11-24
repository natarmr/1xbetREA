package a;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class evn implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evn f8478a = new evn();
    public static final AtomicInteger b = new AtomicInteger(0);

    @Override // java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
