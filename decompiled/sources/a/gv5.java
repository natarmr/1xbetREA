package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gv5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gv5 f11960a;
    private static final ugi0 descriptor;

    static {
        gv5 gv5Var = new gv5();
        f11960a = gv5Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.BaseActionRequest", gv5Var, 6);
        zna0Var.j("VU", true);
        zna0Var.j("AN", true);
        zna0Var.j("CE", true);
        zna0Var.j("GI", true);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{iv5.g[0].getValue(), okxVar, okxVar, mrv.j0(ysm0Var), ysm0Var, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = iv5.g;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        List list = null;
        String str = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ2 = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    strX = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ3 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new iv5(i, list, iJ, iJ2, str, strX, iJ3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iv5 iv5Var = (iv5) obj;
        iv5Var.getClass();
        String str = iv5Var.d;
        int i = iv5Var.c;
        int i2 = iv5Var.b;
        List list = iv5Var.f15429a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = iv5.g;
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, kotlin.collections.a.c(0))) {
            cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || i2 != 0) {
            cldVarA.i(1, i2, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(2, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "0")) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.z(ugi0Var, 4, iv5Var.e);
        cldVarA.i(5, iv5Var.f, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
