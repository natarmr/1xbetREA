package a;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ihx0 extends ehx0 {
    public static final xex0 d = new xex0((byte) 3);
    public static final y50 e = new y50((byte) 24);
    public final AtomicInteger c = new AtomicInteger();

    @Override // a.ehx0
    public final void a() {
        this.c.decrementAndGet();
    }
}
