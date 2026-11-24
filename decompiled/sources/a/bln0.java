package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class bln0 implements xpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2804a;
    public final w7r b;
    public final String c;
    public boolean d;

    public /* synthetic */ bln0(w7r w7rVar, String str, byte b) {
        this.f2804a = b;
        this.b = w7rVar;
        this.c = str;
    }

    public final void a() {
        switch (this.f2804a) {
            case 0:
                if (this.d) {
                    m2x.J(21, "statement is closed");
                    throw null;
                }
                return;
            default:
                if (this.d) {
                    m2x.J(21, "statement is closed");
                    throw null;
                }
                return;
        }
    }

    @Override // a.xpg0
    public void reset() {
        a();
    }

    @Override // a.xpg0
    public void t() {
        a();
    }
}
