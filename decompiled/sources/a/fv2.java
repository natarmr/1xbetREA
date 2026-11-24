package a;

/* JADX INFO: loaded from: classes.dex */
public final class fv2 implements qah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10193a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public fv2(nv2 nv2Var, rv2 rv2Var) {
        this.f10193a = (byte) 1;
        this.b = nv2Var;
        this.c = rv2Var;
    }

    @Override // a.qah0
    public final float a(float f) {
        byte b = this.f10193a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hv2 hv2Var = (hv2) obj2;
                float fE = hv2Var.k1.e(f);
                float fL = fE - hv2Var.k1.f.l();
                ((nv2) obj).a(fE, 0.0f);
                return fL;
            case 1:
                ((nv2) obj).a(((rv2) obj2).f.l() + f, 0.0f);
                return f;
            default:
                sch0 sch0Var = (sch0) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) sch0Var.h.invoke()).booleanValue()) {
                    return sch0Var.e(sch0Var.h(((rch0) obj).a(2, sch0Var.f(sch0Var.i(f)))));
                }
                throw new tkq("The fling animation was cancelled", (byte) 0);
        }
    }

    public /* synthetic */ fv2(Object obj, Object obj2, byte b) {
        this.f10193a = b;
        this.c = obj;
        this.b = obj2;
    }
}
