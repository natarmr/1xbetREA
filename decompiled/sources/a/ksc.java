package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ksc extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final hbu o;
    public final reu p;
    public final yk50 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ksc(mne mneVar, ctf0 ctf0Var, hbu hbuVar, reu reuVar, yk50 yk50Var) {
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.f22085a, mneVar.c);
        super(new zxb((byte) 19), g090VarP, new ep4(ctf0Var, (byte) 21), (yzn0) null);
        this.o = hbuVar;
        this.p = reuVar;
        this.q = yk50Var;
        i3t0.K(this, null, null, new hr(this, null, (byte) 8), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dsc dscVar = (dsc) obj;
        dscVar.getClass();
        super.x(dscVar);
        int iOrdinal = dscVar.f6606a.ordinal();
        yk50 yk50Var = this.q;
        if (iOrdinal == 0) {
            yk50Var.f(wdn.c);
        } else if (iOrdinal == 1) {
            yk50Var.f(wdn.d);
        } else if (iOrdinal != 2) {
            t9f.b();
            return;
        } else {
            yk50Var.f(wdn.c);
            yk50Var.f(wdn.d);
        }
        G(gsc.f11824a);
    }
}
