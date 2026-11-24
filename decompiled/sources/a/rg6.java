package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rg6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rg6 f30418a;
    private static final ugi0 descriptor;

    static {
        rg6 rg6Var = new rg6();
        f30418a = rg6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.BetBuilderEventsResponse.MarketEventResponse", rg6Var, 11);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("blocked", true);
        zna0Var.j("player", true);
        zna0Var.j("parameter", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("ruleId", true);
        zna0Var.j("eventParams", true);
        zna0Var.j("groupId", true);
        zna0Var.j("shortGroupId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(wg6.f39098a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(tg6.f33893a), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l = null;
        Long l2 = null;
        boolean z = true;
        vg6 vg6Var = null;
        int i = 0;
        Long l3 = null;
        Boolean bool = null;
        yg6 yg6Var = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        Boolean bool2 = null;
        Long l4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l3 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    yg6Var = (yg6) bldVarA.e(ugi0Var, 2, wg6.f39098a, yg6Var);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    l4 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l4);
                    i |= 128;
                    break;
                case 8:
                    vg6Var = (vg6) bldVarA.e(ugi0Var, 8, tg6.f33893a, vg6Var);
                    i |= 256;
                    break;
                case 9:
                    l2 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l2);
                    i |= 512;
                    break;
                case 10:
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new zg6(i, l3, bool, yg6Var, d, d2, str, bool2, l4, vg6Var, l2, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zg6 zg6Var = (zg6) obj;
        zg6Var.getClass();
        Long l = zg6Var.k;
        Long l2 = zg6Var.j;
        vg6 vg6Var = zg6Var.i;
        Long l3 = zg6Var.h;
        Boolean bool = zg6Var.g;
        String str = zg6Var.f;
        Double d = zg6Var.e;
        Double d2 = zg6Var.d;
        yg6 yg6Var = zg6Var.c;
        Boolean bool2 = zg6Var.b;
        Long l4 = zg6Var.f44329a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || yg6Var != null) {
            cldVarA.p(ugi0Var, 2, wg6.f39098a, yg6Var);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || vg6Var != null) {
            cldVarA.p(ugi0Var, 8, tg6.f33893a, vg6Var);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
