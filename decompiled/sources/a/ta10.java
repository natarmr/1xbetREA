package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta10 implements ab10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33593a;
    public final /* synthetic */ bb10 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ta10(bb10 bb10Var, String str, byte b) {
        this.f33593a = b;
        this.b = bb10Var;
        this.c = str;
    }

    @Override // a.ab10
    public final void run() {
        switch (this.f33593a) {
            case 0:
                this.b.s(this.c);
                break;
            case 1:
                this.b.r(this.c);
                break;
            default:
                this.b.u(this.c);
                break;
        }
    }
}
