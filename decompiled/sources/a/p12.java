package a;

/* JADX INFO: loaded from: classes3.dex */
public final class p12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26179a = 0;
    public final Object b;

    public p12(o12 o12Var) {
        ii iiVar = o12Var.f24457a;
        r12 r12Var = o12Var.b;
        iiVar.getClass();
        r12Var.getClass();
        this.b = new p12(r12Var);
    }

    public final r12 a() {
        byte b = this.f26179a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (r12) ((p12) obj).b;
            default:
                return (r12) obj;
        }
    }

    public p12(r12 r12Var) {
        this.b = r12Var;
    }
}
