package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vwu0 extends i3t0 {
    public static final /* synthetic */ int p = 0;
    public final duj o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwu0(duj dujVar, mne mneVar, ctf0 ctf0Var) {
        super(new o1u0((byte) 25), cvm0.p(mneVar.c, mneVar.f22085a), new uwu0(ctf0Var, (byte) 0), (yzn0) null);
        ctf0Var.getClass();
        this.o = dujVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        mwu0 mwu0Var = (mwu0) obj;
        mwu0Var.getClass();
        super.x(mwu0Var);
        if (mwu0Var.equals(kwu0.f19020a)) {
            i3t0.K(this, null, new las0(1, this.o, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), new jtr0(this, true, (yje) null), 1);
            return;
        }
        if (!mwu0Var.equals(lwu0.f20781a)) {
            if (mwu0Var.equals(jwu0.f17273a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i3t0.K(this, null, new las0(1, this.o, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), new jtr0(this, false, (yje) null), 1);
    }
}
