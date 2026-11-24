package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ne8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ne8 f23372a;
    private static final ugi0 descriptor;

    static {
        ne8 ne8Var = new ne8();
        f23372a = ne8Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.BonusGamePreviewResult", ne8Var, 13);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("gameName", false);
        zna0Var.j("gameNameId", false);
        zna0Var.j("gameFlag", false);
        zna0Var.j("gameType", false);
        zna0Var.j("maxCoef", false);
        zna0Var.j("isGameWithCashback", false);
        zna0Var.j("forceIFrame", false);
        zna0Var.j("categories", false);
        zna0Var.j("imageInfo", false);
        zna0Var.j("underMaintenance", false);
        zna0Var.j("enable", true);
        zna0Var.j("fullScreenEnable", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pe8.n;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710.f31729a, ysm0Var, okx.f25427a, ics.f14549a, b570.f1988a, ysm0Var, sm8Var, sm8Var, a8zVarArr[8].getValue(), cds.f4176a, sm8Var, sm8Var, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pe8.n;
        Object obj = null;
        long jR = 0;
        List list = null;
        hds hdsVar = null;
        String strX = null;
        hcs hcsVar = null;
        a570 a570Var = null;
        String strX2 = null;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean zB4 = false;
        boolean zB5 = false;
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
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    hcsVar = (hcs) bldVarA.m(ugi0Var, 3, ics.f14549a, hcsVar);
                    i |= 8;
                    break;
                case 4:
                    a570Var = (a570) bldVarA.m(ugi0Var, 4, b570.f1988a, a570Var);
                    i |= 16;
                    break;
                case 5:
                    strX2 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zB = bldVarA.B(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zB2 = bldVarA.B(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) bldVarA.m(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    hdsVar = (hds) bldVarA.m(ugi0Var, 9, cds.f4176a, hdsVar);
                    i |= 512;
                    break;
                case 10:
                    zB3 = bldVarA.B(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    zB4 = bldVarA.B(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    zB5 = bldVarA.B(ugi0Var, 12);
                    i |= 4096;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new pe8(i, jR, strX, iJ, hcsVar, a570Var, strX2, zB, zB2, list, hdsVar, zB3, zB4, zB5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pe8 pe8Var = (pe8) obj;
        pe8Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pe8.n;
        long j = pe8Var.f26839a;
        boolean z = pe8Var.m;
        boolean z2 = pe8Var.l;
        cldVarA.n(ugi0Var, 0, j);
        cldVarA.z(ugi0Var, 1, pe8Var.b);
        cldVarA.i(2, pe8Var.c, ugi0Var);
        cldVarA.m(ugi0Var, 3, ics.f14549a, pe8Var.d);
        cldVarA.m(ugi0Var, 4, b570.f1988a, pe8Var.e);
        cldVarA.z(ugi0Var, 5, pe8Var.f);
        cldVarA.x(ugi0Var, 6, pe8Var.g);
        cldVarA.x(ugi0Var, 7, pe8Var.h);
        cldVarA.m(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), pe8Var.i);
        cldVarA.m(ugi0Var, 9, cds.f4176a, pe8Var.j);
        cldVarA.x(ugi0Var, 10, pe8Var.k);
        if (cldVarA.u(ugi0Var) || !z2) {
            cldVarA.x(ugi0Var, 11, z2);
        }
        if (cldVarA.u(ugi0Var) || z) {
            cldVarA.x(ugi0Var, 12, z);
        }
        cldVarA.c(ugi0Var);
    }
}
