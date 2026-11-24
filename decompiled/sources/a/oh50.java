package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oh50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oh50 f25251a;
    private static final ugi0 descriptor;

    static {
        oh50 oh50Var = new oh50();
        f25251a = oh50Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.alt_design_l.data.nearest_game_details.model.NearestGameDetailsResponse", oh50Var, 15);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("num", true);
        zna0Var.j("constId", true);
        zna0Var.j("startTs", true);
        zna0Var.j("kind", true);
        zna0Var.j("sport", true);
        zna0Var.j("liga", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("matchInfoObj", true);
        zna0Var.j("isFinished", true);
        zna0Var.j("gameVidName", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("subSport", true);
        zna0Var.j("scores", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(s710Var);
        jiy jiyVarJ5 = mrv.j0(yh50.f42621a);
        jiy jiyVarJ6 = mrv.j0(sg50.f32145a);
        fh50 fh50Var = fh50.f9525a;
        jiy jiyVarJ7 = mrv.j0(fh50Var);
        jiy jiyVarJ8 = mrv.j0(fh50Var);
        jiy jiyVarJ9 = mrv.j0(wg50.f39097a);
        jiy jiyVarJ10 = mrv.j0(sm8.f32432a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(gi50.f11329a), mrv.j0(uh50.f35660a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        Long l2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        Boolean bool = null;
        yg50 yg50Var = null;
        String str2 = null;
        hh50 hh50Var = null;
        int i = 0;
        ii50 ii50Var = null;
        wh50 wh50Var = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        ai50 ai50Var = null;
        ug50 ug50Var = null;
        hh50 hh50Var2 = null;
        boolean z = true;
        Long l6 = null;
        Long l7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l6;
                    z = false;
                    bool = bool;
                    l4 = l4;
                    l6 = l;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l6);
                    i |= 1;
                    bool = bool;
                    l3 = l3;
                    l4 = l4;
                    l6 = l;
                    str = str;
                    break;
                case 1:
                    l2 = l4;
                    l7 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l7);
                    i |= 2;
                    l3 = l3;
                    l4 = l2;
                    str = str;
                    break;
                case 2:
                    l2 = l4;
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    l4 = l2;
                    str = str;
                    break;
                case 3:
                    str = str;
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    i |= 8;
                    l3 = l3;
                    str = str;
                    break;
                case 4:
                    l5 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l5);
                    i |= 16;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 5:
                    ai50Var = (ai50) bldVarA.e(ugi0Var, 5, yh50.f42621a, ai50Var);
                    i |= 32;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 6:
                    ug50Var = (ug50) bldVarA.e(ugi0Var, 6, sg50.f32145a, ug50Var);
                    i |= 64;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 7:
                    hh50Var2 = (hh50) bldVarA.e(ugi0Var, 7, fh50.f9525a, hh50Var2);
                    i |= 128;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 8:
                    hh50Var = (hh50) bldVarA.e(ugi0Var, 8, fh50.f9525a, hh50Var);
                    i |= 256;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 9:
                    yg50Var = (yg50) bldVarA.e(ugi0Var, 9, wg50.f39097a, yg50Var);
                    i |= 512;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 12:
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i |= 4096;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 13:
                    ii50Var = (ii50) bldVarA.e(ugi0Var, 13, gi50.f11329a, ii50Var);
                    i |= 8192;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 14:
                    wh50Var = (wh50) bldVarA.e(ugi0Var, 14, uh50.f35660a, wh50Var);
                    i |= 16384;
                    l3 = l3;
                    l4 = l4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str3 = str;
        Long l8 = l4;
        bldVarA.c(ugi0Var);
        return new qh50(i, l6, l7, l3, l8, l5, ai50Var, ug50Var, hh50Var2, hh50Var, yg50Var, bool, str3, str2, ii50Var, wh50Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qh50 qh50Var = (qh50) obj;
        qh50Var.getClass();
        wh50 wh50Var = qh50Var.o;
        ii50 ii50Var = qh50Var.n;
        String str = qh50Var.m;
        String str2 = qh50Var.l;
        Boolean bool = qh50Var.k;
        yg50 yg50Var = qh50Var.j;
        hh50 hh50Var = qh50Var.i;
        hh50 hh50Var2 = qh50Var.h;
        ug50 ug50Var = qh50Var.g;
        ai50 ai50Var = qh50Var.f;
        Long l = qh50Var.e;
        Long l2 = qh50Var.d;
        Long l3 = qh50Var.c;
        Long l4 = qh50Var.b;
        Long l5 = qh50Var.f28723a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || ai50Var != null) {
            cldVarA.p(ugi0Var, 5, yh50.f42621a, ai50Var);
        }
        if (cldVarA.u(ugi0Var) || ug50Var != null) {
            cldVarA.p(ugi0Var, 6, sg50.f32145a, ug50Var);
        }
        if (cldVarA.u(ugi0Var) || hh50Var2 != null) {
            cldVarA.p(ugi0Var, 7, fh50.f9525a, hh50Var2);
        }
        if (cldVarA.u(ugi0Var) || hh50Var != null) {
            cldVarA.p(ugi0Var, 8, fh50.f9525a, hh50Var);
        }
        if (cldVarA.u(ugi0Var) || yg50Var != null) {
            cldVarA.p(ugi0Var, 9, wg50.f39097a, yg50Var);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || ii50Var != 0) {
            cldVarA.p(ugi0Var, 13, gi50.f11329a, ii50Var);
        }
        if (cldVarA.u(ugi0Var) || wh50Var != null) {
            cldVarA.p(ugi0Var, 14, uh50.f35660a, wh50Var);
        }
        cldVarA.c(ugi0Var);
    }
}
