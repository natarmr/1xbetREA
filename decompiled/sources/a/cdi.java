package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cdi implements e6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f4163a;
    public final gst0 b;
    public final rou c;
    public final nhf0 d;

    public cdi(rou rouVar, g45 g45Var, nhf0 nhf0Var, gst0 gst0Var) {
        this.f4163a = g45Var;
        this.b = gst0Var;
        this.c = rouVar;
        this.d = nhf0Var;
    }

    @Override // a.e6e
    public final usd a() {
        return new usd(new nwd());
    }

    @Override // a.e6e
    public final z220 b() {
        return new z220(new jqt(this.b), this.c, this.f4163a, this.d, (byte) 18);
    }

    @Override // a.e6e
    public final dgu c() {
        return new dgu(new ort(this.b, (byte) 3), this.c, this.f4163a, this.d);
    }

    @Override // a.e6e
    public final jcl d() {
        return new jcl(this.f4163a);
    }

    @Override // a.e6e
    public final f4v e() {
        return new f4v(this.f4163a);
    }
}
