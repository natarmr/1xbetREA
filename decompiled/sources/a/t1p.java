package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t1p implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1p f33177a;
    private static final ugi0 descriptor;

    static {
        t1p t1pVar = new t1p();
        f33177a = t1pVar;
        zna0 zna0Var = new zna0("org.xplatform.fatmananalytics.impl.data.models.FatmanPackageEventRequest", t1pVar, 6);
        zna0Var.j("d", false);
        zna0Var.j("o", false);
        zna0Var.j("sw", false);
        zna0Var.j("sh", false);
        zna0Var.j("u", false);
        zna0Var.j("ev", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = v1p.g;
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        return new jiy[]{ysm0Var, ysm0Var, okxVar, okxVar, s710.f31729a, a8zVarArr[5].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = v1p.g;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        String strX2 = null;
        long jR = 0;
        boolean z = true;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX2 = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ2 = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jR = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) bldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new v1p(i, strX, strX2, iJ, iJ2, jR, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v1p v1pVar = (v1p) obj;
        v1pVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = v1p.g;
        cldVarA.z(ugi0Var, 0, v1pVar.f36644a);
        cldVarA.z(ugi0Var, 1, v1pVar.b);
        cldVarA.i(2, v1pVar.c, ugi0Var);
        cldVarA.i(3, v1pVar.d, ugi0Var);
        cldVarA.n(ugi0Var, 4, v1pVar.e);
        cldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), v1pVar.f);
        cldVarA.c(ugi0Var);
    }
}
