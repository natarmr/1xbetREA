package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h95 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h95 f12661a;
    private static final ugi0 descriptor;

    static {
        h95 h95Var = new h95();
        f12661a = h95Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.responses.AvailableValueResponse", h95Var, 3);
        zna0Var.j("value", true);
        zna0Var.j("measure", true);
        zna0Var.j("valueView", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(tbl.f33669a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new t95(i, d, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t95 t95Var = (t95) obj;
        t95Var.getClass();
        String str = t95Var.c;
        String str2 = t95Var.b;
        Double d = t95Var.f33545a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
