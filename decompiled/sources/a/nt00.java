package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nt00 extends w46 {
    public final ft00 b;
    public final p4u c;
    public final kpt d;
    public final mne e;
    public final vzg0 f;
    public final p7m0 g = q7m0.a(new kt00(lak0.c, true));
    public final ol60 h = new ol60(3);
    public final ol60 i = new ol60(3);
    public bby j;

    public nt00(ft00 ft00Var, p4u p4uVar, kpt kptVar, mne mneVar, vzg0 vzg0Var) {
        this.b = ft00Var;
        this.c = p4uVar;
        this.d = kptVar;
        this.e = mneVar;
        this.f = vzg0Var;
    }

    public final Object w(bnn0 bnn0Var) {
        ut00 ut00Var = this.b.f10088a;
        if (ut00Var instanceof tt00) {
            tt00 tt00Var = (tt00) ut00Var;
            return this.c.f(tt00Var.f34488a, tt00Var.b, bnn0Var);
        }
        if (!(ut00Var instanceof st00)) {
            t9f.b();
            return null;
        }
        st00 st00Var = (st00) ut00Var;
        return this.d.a(st00Var.f32751a, st00Var.b, bnn0Var);
    }

    public final void x(String str) {
        v3c.N(this.j);
        this.j = sac.V(jiu0.a(this), new svz(1, this, nt00.class, "handleSearchError", "handleSearchError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, this.e.b, new mt00(this, str, null, (byte) 0), 10);
    }
}
