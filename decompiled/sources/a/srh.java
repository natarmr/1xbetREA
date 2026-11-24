package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class srh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final srh f32675a;
    private static final ugi0 descriptor;

    static {
        srh srhVar = new srh();
        f32675a = srhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.valorant.CyberValorantPlayersResponse", srhVar, 13);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("realName", true);
        zna0Var.j("country", true);
        zna0Var.j("region", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("birthdayStamp", true);
        zna0Var.j("avgCombatScore", true);
        zna0Var.j("avgKills", true);
        zna0Var.j("avgDeaths", true);
        zna0Var.j("avgFirstKills", true);
        zna0Var.j("avgHeadshots", true);
        zna0Var.j("countryImageS3", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        String str = null;
        Float f4 = null;
        int i = 0;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l2 = null;
        Float f5 = null;
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
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    f2 = f2;
                    f = f;
                    break;
                case 1:
                    f = f;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    l = l;
                    f = f;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    l = l;
                    str2 = str2;
                    break;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i |= 8;
                    l = l;
                    str2 = str2;
                    break;
                case 4:
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i |= 16;
                    l = l;
                    str2 = str2;
                    break;
                case 5:
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i |= 32;
                    l = l;
                    str2 = str2;
                    break;
                case 6:
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
                    i |= 64;
                    l = l;
                    str2 = str2;
                    break;
                case 7:
                    f5 = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f5);
                    i |= 128;
                    l = l;
                    str2 = str2;
                    break;
                case 8:
                    f4 = (Float) bldVarA.e(ugi0Var, 8, klq.f18504a, f4);
                    i |= 256;
                    l = l;
                    str2 = str2;
                    break;
                case 9:
                    f3 = (Float) bldVarA.e(ugi0Var, 9, klq.f18504a, f3);
                    i |= 512;
                    l = l;
                    str2 = str2;
                    break;
                case 10:
                    f2 = (Float) bldVarA.e(ugi0Var, 10, klq.f18504a, f2);
                    i |= 1024;
                    l = l;
                    str2 = str2;
                    break;
                case 11:
                    f = (Float) bldVarA.e(ugi0Var, 11, klq.f18504a, f);
                    i |= 2048;
                    l = l;
                    str2 = str2;
                    break;
                case 12:
                    str = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str);
                    i |= 4096;
                    l = l;
                    str2 = str2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Float f6 = f2;
        bldVarA.c(ugi0Var);
        return new urh(i, l, str2, str3, str4, str5, str6, l2, f5, f4, f3, f6, f, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        urh urhVar = (urh) obj;
        urhVar.getClass();
        String str = urhVar.m;
        Float f = urhVar.l;
        Float f2 = urhVar.k;
        Float f3 = urhVar.j;
        Float f4 = urhVar.i;
        Float f5 = urhVar.h;
        Long l = urhVar.g;
        String str2 = urhVar.f;
        String str3 = urhVar.e;
        String str4 = urhVar.d;
        String str5 = urhVar.c;
        String str6 = urhVar.b;
        Long l2 = urhVar.f36162a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
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
        if (cldVarA.u(ugi0Var) || f5 != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f5);
        }
        if (cldVarA.u(ugi0Var) || f4 != null) {
            cldVarA.p(ugi0Var, 8, klq.f18504a, f4);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 9, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 10, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 11, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
