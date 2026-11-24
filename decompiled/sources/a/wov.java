package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wov implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wov f39516a;
    private static final ugi0 descriptor;

    static {
        wov wovVar = new wov();
        f39516a = wovVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.head_to_head.model.HeadToHeadResponse.Statistic.Game", wovVar, 9);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("noScore", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("winner", true);
        zna0Var.j("tournamentTitle", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(s710.f31729a), mrv.j0(okxVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Long l = null;
        Integer num3 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l);
                    i |= 64;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new apv(i, str2, str3, str4, num, num2, bool, l, num3, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        apv apvVar = (apv) obj;
        apvVar.getClass();
        String str = apvVar.i;
        Integer num = apvVar.h;
        Long l = apvVar.g;
        Boolean bool = apvVar.f;
        Integer num2 = apvVar.e;
        Integer num3 = apvVar.d;
        String str2 = apvVar.c;
        String str3 = apvVar.b;
        String str4 = apvVar.f1270a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
