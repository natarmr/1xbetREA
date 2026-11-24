package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class za10 implements ab10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44047a;
    public final /* synthetic */ bb10 b;

    public /* synthetic */ za10(bb10 bb10Var, byte b) {
        this.f44047a = b;
        this.b = bb10Var;
    }

    @Override // a.ab10
    public final void run() {
        byte b = this.f44047a;
        bb10 bb10Var = this.b;
        switch (b) {
            case 0:
                bb10Var.n();
                break;
            default:
                bb10Var.l();
                break;
        }
    }
}
