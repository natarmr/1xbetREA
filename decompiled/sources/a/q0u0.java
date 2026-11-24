package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0u0 f27922a;
    private static final ugi0 descriptor;

    static {
        q0u0 q0u0Var = new q0u0();
        f27922a = q0u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.valorant.impl.data.model.matches.match.ValorantStatisticMatchesMatchTeamPlayerResponse", q0u0Var, 15);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("assists", true);
        zna0Var.j("multiKills", true);
        zna0Var.j("clutches", true);
        zna0Var.j("firstKills", true);
        zna0Var.j("firstDeaths", true);
        zna0Var.j("damageAvg", true);
        zna0Var.j("combatScoreAvg", true);
        zna0Var.j("heroName", true);
        zna0Var.j("heroImageS3", true);
        zna0Var.j("headShots", true);
        zna0Var.j("bodyShots", true);
        zna0Var.j("legShots", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        Integer num2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i = 0;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        boolean z = true;
        Integer num14 = null;
        Integer num15 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num14;
                    z = false;
                    str2 = str2;
                    num9 = num9;
                    num14 = num;
                    str = str;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num14);
                    i |= 1;
                    str2 = str2;
                    num8 = num8;
                    num9 = num9;
                    num14 = num;
                    str = str;
                    break;
                case 1:
                    num2 = num9;
                    num15 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num15);
                    i |= 2;
                    num8 = num8;
                    num9 = num2;
                    str = str;
                    break;
                case 2:
                    num2 = num9;
                    num8 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num8);
                    i |= 4;
                    num9 = num2;
                    str = str;
                    break;
                case 3:
                    str = str;
                    num9 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num9);
                    i |= 8;
                    num8 = num8;
                    str = str;
                    break;
                case 4:
                    num10 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num10);
                    i |= 16;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 5:
                    num11 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num11);
                    i |= 32;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 6:
                    num12 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num12);
                    i |= 64;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 7:
                    num13 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num13);
                    i |= 128;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 8:
                    num5 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num5);
                    i |= 256;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 9:
                    num3 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num3);
                    i |= 512;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 12:
                    num4 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num4);
                    i |= 4096;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 13:
                    num6 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num6);
                    i |= 8192;
                    num8 = num8;
                    num9 = num9;
                    break;
                case 14:
                    num7 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num7);
                    i |= 16384;
                    num8 = num8;
                    num9 = num9;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str3 = str;
        Integer num16 = num9;
        bldVarA.c(ugi0Var);
        return new s0u0(i, num14, num15, num8, num16, num10, num11, num12, num13, num5, num3, str2, str3, num4, num6, num7);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s0u0 s0u0Var = (s0u0) obj;
        s0u0Var.getClass();
        Integer num = s0u0Var.o;
        Integer num2 = s0u0Var.n;
        Integer num3 = s0u0Var.m;
        String str = s0u0Var.l;
        String str2 = s0u0Var.k;
        Integer num4 = s0u0Var.j;
        Integer num5 = s0u0Var.i;
        Integer num6 = s0u0Var.h;
        Integer num7 = s0u0Var.g;
        Integer num8 = s0u0Var.f;
        Integer num9 = s0u0Var.e;
        Integer num10 = s0u0Var.d;
        Integer num11 = s0u0Var.c;
        Integer num12 = s0u0Var.b;
        Integer num13 = s0u0Var.f31427a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num13 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num13);
        }
        if (cldVarA.u(ugi0Var) || num12 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num12);
        }
        if (cldVarA.u(ugi0Var) || num11 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num11);
        }
        if (cldVarA.u(ugi0Var) || num10 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num10);
        }
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num3 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
