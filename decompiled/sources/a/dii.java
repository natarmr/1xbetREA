package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dii implements mct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do20 f6140a;
    public final r9u b;
    public final n5d0 c = mbl.b(new p8i((byte) 4));

    public dii(kj5 kj5Var, r9u r9uVar, htz htzVar, do20 do20Var, sxs0 sxs0Var) {
        this.f6140a = do20Var;
        this.b = r9uVar;
    }

    @Override // a.mct
    public final r2t a() {
        return (r2t) this.c.get();
    }

    @Override // a.mct
    public final ddk b() {
        return new ddk();
    }

    @Override // a.mct
    public final oct c() {
        return new oct(new uxs0((byte) 12), new mj8(((nai) this.f6140a.f6397a).f23192a, (byte) 0), new bj5(), this.b);
    }
}
