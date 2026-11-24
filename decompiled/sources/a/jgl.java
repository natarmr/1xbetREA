package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jgl implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jgl f16486a;
    private static final ugi0 descriptor;

    static {
        jgl jglVar = new jgl();
        f16486a = jglVar;
        zna0 zna0Var = new zna0("org.xplatform.dragons_gold.data.models.requests.DragonsGoldRequest", jglVar, 7);
        zna0Var.j("UI", false);
        zna0Var.j("BINF", true);
        zna0Var.j("BAC", false);
        zna0Var.j("BS", true);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        zna0Var.j("VU", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lgl.h;
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, mrv.j0(zf8.f44290a), s710Var, mrv.j0(tbl.f33669a), okx.f25427a, ysm0.f43175a, a8zVarArr[6].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lgl.h;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        List list = null;
        bg8 bg8Var = null;
        Double d = null;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    bg8Var = (bg8) bldVarA.e(ugi0Var, 1, zf8.f44290a, bg8Var);
                    i |= 2;
                    break;
                case 2:
                    jR2 = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    iJ = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) bldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new lgl(i, jR, bg8Var, jR2, d, iJ, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lgl lglVar = (lgl) obj;
        lglVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lgl.h;
        long j = lglVar.f20014a;
        Double d = lglVar.d;
        bg8 bg8Var = lglVar.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 1, zf8.f44290a, bg8Var);
        }
        cldVarA.n(ugi0Var, 2, lglVar.c);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        cldVarA.i(4, lglVar.e, ugi0Var);
        cldVarA.z(ugi0Var, 5, lglVar.f);
        cldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), lglVar.g);
        cldVarA.c(ugi0Var);
    }
}
