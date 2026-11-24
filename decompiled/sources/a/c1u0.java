package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c1u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1u0 f3593a;
    private static final ugi0 descriptor;

    static {
        c1u0 c1u0Var = new c1u0();
        f3593a = c1u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.valorant.impl.data.model.matches.team.ValorantStatisticMatchesTeamPlayerResponse", c1u0Var, 13);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("realName", true);
        zna0Var.j("country", true);
        zna0Var.j("countryImageS3", true);
        zna0Var.j("region", true);
        zna0Var.j("birthdayStamp", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("avgCombatScore", true);
        zna0Var.j("avgKills", true);
        zna0Var.j("avgDeaths", true);
        zna0Var.j("avgFirstKills", true);
        zna0Var.j("avgHeadshots", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(s710.f31729a);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        String str6 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    f2 = f2;
                    f = f;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    f2 = f2;
                    f = f;
                    break;
                case 1:
                    f = f;
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    num = num;
                    f = f;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    num = num;
                    str = str;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    num = num;
                    str = str;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    num = num;
                    str = str;
                    break;
                case 5:
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i |= 32;
                    num = num;
                    str = str;
                    break;
                case 6:
                    l = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l);
                    i |= 64;
                    num = num;
                    str = str;
                    break;
                case 7:
                    str6 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str6);
                    i |= 128;
                    num = num;
                    str = str;
                    break;
                case 8:
                    f5 = (Float) bldVarA.e(ugi0Var, 8, klq.f18504a, f5);
                    i |= 256;
                    num = num;
                    str = str;
                    break;
                case 9:
                    f3 = (Float) bldVarA.e(ugi0Var, 9, klq.f18504a, f3);
                    i |= 512;
                    num = num;
                    str = str;
                    break;
                case 10:
                    f2 = (Float) bldVarA.e(ugi0Var, 10, klq.f18504a, f2);
                    i |= 1024;
                    num = num;
                    str = str;
                    break;
                case 11:
                    f = (Float) bldVarA.e(ugi0Var, 11, klq.f18504a, f);
                    i |= 2048;
                    num = num;
                    str = str;
                    break;
                case 12:
                    f4 = (Float) bldVarA.e(ugi0Var, 12, klq.f18504a, f4);
                    i |= 4096;
                    num = num;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Float f6 = f2;
        bldVarA.c(ugi0Var);
        return new e1u0(i, num, str, str2, str3, str4, str5, l, str6, f5, f3, f6, f, f4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e1u0 e1u0Var = (e1u0) obj;
        e1u0Var.getClass();
        Float f = e1u0Var.m;
        Float f2 = e1u0Var.l;
        Float f3 = e1u0Var.k;
        Float f4 = e1u0Var.j;
        Float f5 = e1u0Var.i;
        String str = e1u0Var.h;
        Long l = e1u0Var.g;
        String str2 = e1u0Var.f;
        String str3 = e1u0Var.e;
        String str4 = e1u0Var.d;
        String str5 = e1u0Var.c;
        String str6 = e1u0Var.b;
        Integer num = e1u0Var.f7054a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || f5 != null) {
            cldVarA.p(ugi0Var, 8, klq.f18504a, f5);
        }
        if (cldVarA.u(ugi0Var) || f4 != null) {
            cldVarA.p(ugi0Var, 9, klq.f18504a, f4);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 10, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 11, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != 0) {
            cldVarA.p(ugi0Var, 12, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
