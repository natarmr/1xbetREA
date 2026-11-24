package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ym9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ym9 f42877a;
    private static final ugi0 descriptor;

    static {
        ym9 ym9Var = new ym9();
        f42877a = ym9Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.calendar_tournament.CalendarTournamentMatchResponse", ym9Var, 10);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("feedConstId", true);
        zna0Var.j("feedGameId", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("toTeam1MatchId", true);
        zna0Var.j("toTeam2MatchId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("startedAt", true);
        zna0Var.j("startedAtStamp", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        cn9 cn9Var = cn9.f4643a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(cn9Var), mrv.j0(cn9Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        en9 en9Var = null;
        en9 en9Var2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    break;
                case 3:
                    en9Var = (en9) bldVarA.e(ugi0Var, 3, cn9.f4643a, en9Var);
                    i |= 8;
                    break;
                case 4:
                    en9Var2 = (en9) bldVarA.e(ugi0Var, 4, cn9.f4643a, en9Var2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                case 9:
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new an9(i, str2, l2, l3, en9Var, en9Var2, str3, str4, num, str, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        an9 an9Var = (an9) obj;
        an9Var.getClass();
        Long l = an9Var.j;
        String str = an9Var.i;
        Integer num = an9Var.h;
        String str2 = an9Var.g;
        String str3 = an9Var.f;
        en9 en9Var = an9Var.e;
        en9 en9Var2 = an9Var.d;
        Long l2 = an9Var.c;
        Long l3 = an9Var.b;
        String str4 = an9Var.f1139a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || en9Var2 != null) {
            cldVarA.p(ugi0Var, 3, cn9.f4643a, en9Var2);
        }
        if (cldVarA.u(ugi0Var) || en9Var != null) {
            cldVarA.p(ugi0Var, 4, cn9.f4643a, en9Var);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
