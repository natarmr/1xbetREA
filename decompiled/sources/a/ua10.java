package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ua10 implements ab10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35309a;
    public final /* synthetic */ bb10 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ua10(bb10 bb10Var, int i, byte b) {
        this.f35309a = b;
        this.b = bb10Var;
        this.c = i;
    }

    @Override // a.ab10
    public final void run() {
        byte b = this.f35309a;
        int i = this.c;
        bb10 bb10Var = this.b;
        switch (b) {
            case 0:
                bb10Var.q(i);
                break;
            case 1:
                bb10Var.t(i);
                break;
            default:
                bb10Var.p(i);
                break;
        }
    }
}
