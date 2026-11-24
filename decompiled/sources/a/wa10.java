package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa10 implements ab10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38807a;
    public final /* synthetic */ bb10 b;
    public final /* synthetic */ float c;

    public /* synthetic */ wa10(bb10 bb10Var, float f, byte b) {
        this.f38807a = b;
        this.b = bb10Var;
        this.c = f;
    }

    @Override // a.ab10
    public final void run() {
        byte b = this.f38807a;
        float f = this.c;
        bb10 bb10Var = this.b;
        switch (b) {
            case 0:
                fa10 fa10Var = bb10Var.f2286a;
                if (fa10Var != null) {
                    ub10 ub10Var = bb10Var.b;
                    ub10Var.i(ub10Var.j, ah40.f(fa10Var.l, fa10Var.m, f));
                } else {
                    bb10Var.f.add(new wa10(bb10Var, f, (byte) 0));
                }
                break;
            case 1:
                fa10 fa10Var2 = bb10Var.f2286a;
                if (fa10Var2 != null) {
                    bb10Var.t((int) ah40.f(fa10Var2.l, fa10Var2.m, f));
                } else {
                    bb10Var.f.add(new wa10(bb10Var, f, (byte) 1));
                }
                break;
            default:
                bb10Var.v(f);
                break;
        }
    }
}
