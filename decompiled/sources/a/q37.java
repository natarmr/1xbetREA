package a;

/* JADX INFO: loaded from: classes3.dex */
public final class q37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28037a;
    public final b4j b;
    public final au0 c;
    public final s64 d;
    public final ih5 e;
    public final l7k f;
    public final qu g;
    public final s64 h;
    public final ix0 i;

    public /* synthetic */ q37(b4j b4jVar, au0 au0Var, s64 s64Var, ih5 ih5Var, l7k l7kVar, qu quVar, s64 s64Var2, ix0 ix0Var, byte b) {
        this.f28037a = b;
        this.b = b4jVar;
        this.c = au0Var;
        this.d = s64Var;
        this.e = ih5Var;
        this.f = l7kVar;
        this.g = quVar;
        this.h = s64Var2;
        this.i = ix0Var;
    }

    public final void a(byv byvVar, z5w z5wVar, r6w r6wVar) {
        byte b = this.f28037a;
        au0 au0Var = this.c;
        b4j b4jVar = this.b;
        switch (b) {
            case 0:
                byvVar.getClass();
                if (r6wVar != r6w.f) {
                    b4jVar.a(byvVar, z5wVar, r6wVar);
                    au0Var.b(byvVar.a(), z5wVar.a(), r6wVar.a());
                }
                break;
            default:
                if (r6wVar != r6w.f) {
                    b4jVar.a(byvVar, z5wVar, r6wVar);
                    au0Var.b(byvVar.a(), z5wVar.a(), r6wVar.a());
                }
                break;
        }
    }

    public void b(f4w f4wVar) {
        i8i.D("point", f4wVar.a(), this.b.f1961a, f4w.f8934a.a());
        b1j.v(f4wVar.a(), this.c.f1455a, 3199L);
    }

    public void c(ozv ozvVar, z5w z5wVar, r6w r6wVar, String str, String str2) {
        str.getClass();
        if (r6wVar != r6w.f) {
            a1w a1wVar = a1w.f93a;
            this.b.j(ozvVar, z5wVar, r6wVar, str, str2);
            this.c.i((float) ozvVar.f26117a, z5wVar.a(), r6wVar.a(), str, str2);
        }
    }
}
