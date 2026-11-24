package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xel implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xel f40748a;
    private static final ugi0 descriptor;

    static {
        xel xelVar = new xel();
        f40748a = xelVar;
        zna0 zna0Var = new zna0("org.xplatform.dragons_gold.data.models.requests.DragonsGoldActionRequest", xelVar, 5);
        zna0Var.j("UI", false);
        zna0Var.j("AN", false);
        zna0Var.j("CE", false);
        zna0Var.j("LG", false);
        zna0Var.j("VU", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zel.f;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, okxVar, okxVar, ysm0.f43175a, a8zVarArr[4].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zel.f;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        String strX = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                strX = bldVarA.x(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new zel(i, iJ, iJ2, jR, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zel zelVar = (zel) obj;
        zelVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zel.f;
        cldVarA.n(ugi0Var, 0, zelVar.f44257a);
        cldVarA.i(1, zelVar.b, ugi0Var);
        cldVarA.i(2, zelVar.c, ugi0Var);
        cldVarA.z(ugi0Var, 3, zelVar.d);
        cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), zelVar.e);
        cldVarA.c(ugi0Var);
    }
}
