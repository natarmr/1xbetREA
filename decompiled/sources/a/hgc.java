package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hgc implements hb50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sgy f13010a;
    public final /* synthetic */ sfc b;
    public final /* synthetic */ fwv0 c;
    public final /* synthetic */ jiy d;

    public hgc(sgy sgyVar, sfc sfcVar, fwv0 fwv0Var, jiy jiyVar) {
        this.f13010a = sgyVar;
        this.b = sfcVar;
        this.c = fwv0Var;
        this.d = jiyVar;
    }

    @Override // a.hb50
    public final void a(nw20 nw20Var) {
        nw20Var.s(this.f13010a, this.d);
    }

    @Override // a.hb50
    public final void b(phf0 phf0Var) {
        phf0Var.a(this.f13010a, i13.v, i13.w, new ugd(-766986073, true, new ggc(this.b, this.c, (byte) 1)));
    }
}
