package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sv5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv5 f32850a;
    private static final ugi0 descriptor;

    static {
        sv5 sv5Var = new sv5();
        f32850a = sv5Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.BaseBonusRequest", sv5Var, 6);
        zna0Var.j("VU", true);
        zna0Var.j("BINF", true);
        zna0Var.j("BS", true);
        zna0Var.j("BAC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{uv5.g[0].getValue(), mrv.j0(zf8.f44290a), mrv.j0(tbl.f33669a), s710.f31729a, ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = uv5.g;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        bg8 bg8Var = null;
        Double d = null;
        String strX = null;
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
                    list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    bg8Var = (bg8) bldVarA.e(ugi0Var, 1, zf8.f44290a, bg8Var);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    jR = bldVarA.r(ugi0Var, 3);
                    i |= 8;
                    continue;
                case 4:
                    strX = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    iJ = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new uv5(i, iJ, jR, bg8Var, d, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uv5 uv5Var = (uv5) obj;
        uv5Var.getClass();
        Double d = uv5Var.c;
        bg8 bg8Var = uv5Var.b;
        List list = uv5Var.f36332a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = uv5.g;
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, iun.f15405a)) {
            cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 1, zf8.f44290a, bg8Var);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.n(ugi0Var, 3, uv5Var.d);
        cldVarA.z(ugi0Var, 4, uv5Var.e);
        cldVarA.i(5, uv5Var.f, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
