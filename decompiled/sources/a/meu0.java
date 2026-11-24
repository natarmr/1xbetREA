package a;

/* JADX INFO: loaded from: classes3.dex */
public final class meu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tkz f21666a;
    public bby b;
    public final p7m0 c = q7m0.a(0L);

    public meu0(tkz tkzVar) {
        this.f21666a = tkzVar;
    }

    public final void a() {
        if (((Number) this.c.getValue()).longValue() >= 180) {
            return;
        }
        v3c.N(this.b);
        this.b = sac.Y(this.f21666a, 1L, null, new npt0(this, (byte) 9), new wup0(this, null, (byte) 12), 4);
    }
}
