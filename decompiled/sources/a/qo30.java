package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qo30 implements ee60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final deg0 f29053a;
    public final zh00 b;
    public int c = -1;

    public qo30(deg0 deg0Var, zh00 zh00Var) {
        this.f29053a = deg0Var;
        this.b = zh00Var;
    }

    @Override // a.ee60
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.f29053a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}
