package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fgb extends jhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9483a;
    public final /* synthetic */ yx5 b;

    public /* synthetic */ fgb(yx5 yx5Var, byte b) {
        this.f9483a = b;
        this.b = yx5Var;
    }

    @Override // a.jhe0
    public final boolean a(int i, int i2) {
        byte b = this.f9483a;
        yx5 yx5Var = this.b;
        switch (b) {
            case 0:
                if (Math.abs(i2) <= 6500) {
                    return false;
                }
                int iSignum = ((int) Math.signum(i2)) * 6500;
                kl5 kl5Var = hgb.c2;
                ((hgb) yx5Var).G0().f.Q(i, iSignum);
                return true;
            default:
                if (Math.abs(i2) <= 6500) {
                    return false;
                }
                int iSignum2 = ((int) Math.signum(i2)) * 6500;
                eke0 eke0Var = syl0.f2;
                ((syl0) yx5Var).G0().g.Q(i, iSignum2);
                return true;
        }
    }
}
