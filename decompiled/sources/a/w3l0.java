package a;

/* JADX INFO: loaded from: classes6.dex */
public final class w3l0 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38507a;
    public final /* synthetic */ ngk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w3l0(ngk0 ngk0Var, String str, byte b) {
        this.f38507a = b;
        this.b = ngk0Var;
        this.c = str;
    }

    @Override // a.kwk
    public final void a() {
        switch (this.f38507a) {
            case 0:
                this.b.remove(this.c);
                break;
            case 1:
                this.b.remove(this.c);
                break;
            case 2:
                this.b.remove(this.c);
                break;
            default:
                this.b.remove(this.c);
                break;
        }
    }
}
