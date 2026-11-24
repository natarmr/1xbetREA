package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa10 implements ab10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb10 f40532a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ xa10(bb10 bb10Var, int i, int i2) {
        this.f40532a = bb10Var;
        this.b = i;
        this.c = i2;
    }

    @Override // a.ab10
    public final void run() {
        bb10 bb10Var = this.f40532a;
        fa10 fa10Var = bb10Var.f2286a;
        int i = this.b;
        int i2 = this.c;
        if (fa10Var == null) {
            bb10Var.f.add(new xa10(bb10Var, i, i2));
        } else {
            bb10Var.b.i(i, i2 + 0.99f);
        }
    }
}
