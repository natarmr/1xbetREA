package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zj10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zj10 f44465a;
    private static final ugi0 descriptor;

    static {
        zj10 zj10Var = new zj10();
        f44465a = zj10Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_card.data.model.LuckyCardRequest", zj10Var, 6);
        zna0Var.j("BAC", false);
        zna0Var.j("BINF", true);
        zna0Var.j("BS", true);
        zna0Var.j("WH", false);
        zna0Var.j("VU", true);
        zna0Var.j("LG", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, mrv.j0(zf8.f44290a), mrv.j0(tbl.f33669a), okx.f25427a, bk10.g[4].getValue(), ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bk10.g;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        long jR = 0;
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
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    iJ = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    strX = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new bk10(i, iJ, jR, bg8Var, d, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bk10 bk10Var = (bk10) obj;
        bk10Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bk10.g;
        long j = bk10Var.f2728a;
        List list = bk10Var.e;
        Double d = bk10Var.c;
        bg8 bg8Var = bk10Var.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 1, zf8.f44290a, bg8Var);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.i(3, bk10Var.d, ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, iun.f15405a)) {
            cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.z(ugi0Var, 5, bk10Var.f);
        cldVarA.c(ugi0Var);
    }
}
