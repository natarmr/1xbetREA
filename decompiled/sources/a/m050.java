package a;

/* JADX INFO: loaded from: classes.dex */
public final class m050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20938a;
    public final x04 b;
    public final Object c;

    public m050(i050 i050Var) {
        this.f20938a = (byte) 0;
        i050Var.getClass();
        this.c = i050Var;
        this.b = o2e.X(false);
    }

    public final boolean a() {
        byte b = this.f20938a;
        x04 x04Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return x04Var.b();
    }

    public final boolean b() {
        yje yjeVar = null;
        switch (this.f20938a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((i050) this.c).c(null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                hng hngVar = (hng) this.c;
                synchronized (hngVar.e) {
                    int i = hngVar.f13350a - 1;
                    hngVar.f13350a = i;
                    if (i == 0 && !hngVar.b) {
                        hngVar.f = qjj.W((vne) hngVar.c, null, null, new k6s0(hngVar, yjeVar, (byte) 21), 3);
                    }
                    break;
                }
                return true;
        }
    }

    public m050(hng hngVar) {
        this.f20938a = (byte) 1;
        this.c = hngVar;
        this.b = o2e.X(false);
    }
}
