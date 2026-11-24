package a;

/* JADX INFO: loaded from: classes.dex */
public final class dvn implements AutoCloseable {
    public static final dvn c;
    public static yyb0 d;
    public static final avn e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6752a;
    public volatile boolean b;

    static {
        dvn dvnVar = new dvn();
        c = dvnVar;
        run runVar = new run(dvnVar);
        d = runVar;
        e = new avn(-1L, -1L, "Empty Thread", runVar);
        o9d.f24874a.incrementAndGet();
    }

    public dvn() {
        evn evnVar = evn.f8478a;
        this.f6752a = new Object();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        evn.f8478a.close();
    }
}
