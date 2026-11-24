package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nbv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nbv f23260a;
    private static final ugi0 descriptor;

    static {
        nbv nbvVar = new nbv();
        f23260a = nbvVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.GpResult", nbvVar, 18);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("applyCategories", false);
        zna0Var.j("gameName", false);
        zna0Var.j("gameFlag", false);
        zna0Var.j("gameType", false);
        zna0Var.j("maxCoef", false);
        zna0Var.j("isGameWithCashback", false);
        zna0Var.j("isBonusAllowedFromSecondaryAccount", false);
        zna0Var.j("isBonusAccountAllowed", false);
        zna0Var.j("availabilityGameFromBonusAcc", false);
        zna0Var.j("forceIFrame", false);
        zna0Var.j("bonusAllowed", false);
        zna0Var.j("favoriteGame", true);
        zna0Var.j("imageInfo", false);
        zna0Var.j("demoModeAvailable", false);
        zna0Var.j("underMaintenance", false);
        zna0Var.j("enable", true);
        zna0Var.j("fullScreenEnable", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pbv.s;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710.f31729a, a8zVarArr[1].getValue(), ysm0Var, ics.f14549a, b570.f1988a, ysm0Var, sm8Var, sm8Var, sm8Var, sm8Var, sm8Var, sm8Var, sm8Var, cds.f4176a, sm8Var, sm8Var, sm8Var, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pbv.s;
        Object obj = null;
        int i2 = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean zB4 = false;
        boolean zB5 = false;
        boolean zB6 = false;
        boolean zB7 = false;
        boolean zB8 = false;
        boolean zB9 = false;
        boolean zB10 = false;
        boolean zB11 = false;
        long jR = 0;
        hds hdsVar = null;
        List list = null;
        String strX = null;
        hcs hcsVar = null;
        a570 a570Var = null;
        String strX2 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i2 |= 1;
                    obj = null;
                    break;
                case 1:
                    list = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i2 |= 2;
                    obj = null;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i2 |= 4;
                    obj = null;
                    break;
                case 3:
                    hcsVar = (hcs) bldVarA.m(ugi0Var, 3, ics.f14549a, hcsVar);
                    i2 |= 8;
                    obj = null;
                    break;
                case 4:
                    a570Var = (a570) bldVarA.m(ugi0Var, 4, b570.f1988a, a570Var);
                    i2 |= 16;
                    obj = null;
                    break;
                case 5:
                    strX2 = bldVarA.x(ugi0Var, 5);
                    i2 |= 32;
                    obj = null;
                    break;
                case 6:
                    zB = bldVarA.B(ugi0Var, 6);
                    i2 |= 64;
                    obj = null;
                    break;
                case 7:
                    zB2 = bldVarA.B(ugi0Var, 7);
                    i2 |= 128;
                    obj = null;
                    break;
                case 8:
                    zB3 = bldVarA.B(ugi0Var, 8);
                    i2 |= 256;
                    obj = null;
                    break;
                case 9:
                    zB4 = bldVarA.B(ugi0Var, 9);
                    i2 |= 512;
                    obj = null;
                    break;
                case 10:
                    zB5 = bldVarA.B(ugi0Var, 10);
                    i2 |= 1024;
                    obj = null;
                    break;
                case 11:
                    zB6 = bldVarA.B(ugi0Var, 11);
                    i2 |= 2048;
                    obj = null;
                    break;
                case 12:
                    zB7 = bldVarA.B(ugi0Var, 12);
                    i2 |= 4096;
                    obj = null;
                    break;
                case 13:
                    hdsVar = (hds) bldVarA.m(ugi0Var, 13, cds.f4176a, hdsVar);
                    i2 |= 8192;
                    obj = null;
                    break;
                case 14:
                    zB8 = bldVarA.B(ugi0Var, 14);
                    i2 |= 16384;
                    break;
                case 15:
                    zB9 = bldVarA.B(ugi0Var, 15);
                    i = 32768;
                    i2 |= i;
                    break;
                case 16:
                    zB10 = bldVarA.B(ugi0Var, 16);
                    i = 65536;
                    i2 |= i;
                    break;
                case 17:
                    zB11 = bldVarA.B(ugi0Var, 17);
                    i = 131072;
                    i2 |= i;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
        }
        bldVarA.c(ugi0Var);
        return new pbv(i2, jR, list, strX, hcsVar, a570Var, strX2, zB, zB2, zB3, zB4, zB5, zB6, zB7, hdsVar, zB8, zB9, zB10, zB11);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pbv pbvVar = (pbv) obj;
        pbvVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pbv.s;
        long j = pbvVar.f26728a;
        boolean z = pbvVar.r;
        boolean z2 = pbvVar.q;
        boolean z3 = pbvVar.m;
        cldVarA.n(ugi0Var, 0, j);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), pbvVar.b);
        cldVarA.z(ugi0Var, 2, pbvVar.c);
        cldVarA.m(ugi0Var, 3, ics.f14549a, pbvVar.d);
        cldVarA.m(ugi0Var, 4, b570.f1988a, pbvVar.e);
        cldVarA.z(ugi0Var, 5, pbvVar.f);
        cldVarA.x(ugi0Var, 6, pbvVar.g);
        cldVarA.x(ugi0Var, 7, pbvVar.h);
        cldVarA.x(ugi0Var, 8, pbvVar.i);
        cldVarA.x(ugi0Var, 9, pbvVar.j);
        cldVarA.x(ugi0Var, 10, pbvVar.k);
        cldVarA.x(ugi0Var, 11, pbvVar.l);
        if (cldVarA.u(ugi0Var) || z3) {
            cldVarA.x(ugi0Var, 12, z3);
        }
        cldVarA.m(ugi0Var, 13, cds.f4176a, pbvVar.n);
        cldVarA.x(ugi0Var, 14, pbvVar.o);
        cldVarA.x(ugi0Var, 15, pbvVar.p);
        if (cldVarA.u(ugi0Var) || !z2) {
            cldVarA.x(ugi0Var, 16, z2);
        }
        if (cldVarA.u(ugi0Var) || z) {
            cldVarA.x(ugi0Var, 17, z);
        }
        cldVarA.c(ugi0Var);
    }
}
