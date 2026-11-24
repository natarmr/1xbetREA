package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uu20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uu20 f36282a;
    private static final ugi0 descriptor;

    static {
        uu20 uu20Var = new uu20();
        f36282a = uu20Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.MarketGroupResponse.GameEvent", uu20Var, 9);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("cf", true);
        zna0Var.j("parameter", true);
        zna0Var.j("blocked", true);
        zna0Var.j("cfView", true);
        zna0Var.j("player", true);
        zna0Var.j("ruleId", true);
        zna0Var.j("specialSign", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(tblVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0(zu20.f44990a), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(wu20.f39772a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        yu20 yu20Var = null;
        Long l = null;
        Double d = null;
        Double d2 = null;
        Boolean bool = null;
        String str = null;
        bv20 bv20Var = null;
        Long l2 = null;
        Boolean bool2 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    bv20Var = (bv20) bldVarA.e(ugi0Var, 5, zu20.f44990a, bv20Var);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool2);
                    i |= 128;
                    break;
                case 8:
                    yu20Var = (yu20) bldVarA.e(ugi0Var, 8, wu20.f39772a, yu20Var);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new cv20(i, l, d, d2, bool, str, bv20Var, l2, bool2, yu20Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cv20 cv20Var = (cv20) obj;
        cv20Var.getClass();
        yu20 yu20Var = cv20Var.i;
        Boolean bool = cv20Var.h;
        Long l = cv20Var.g;
        bv20 bv20Var = cv20Var.f;
        String str = cv20Var.e;
        Boolean bool2 = cv20Var.d;
        Double d = cv20Var.c;
        Double d2 = cv20Var.b;
        Long l2 = cv20Var.f5013a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bv20Var != null) {
            cldVarA.p(ugi0Var, 5, zu20.f44990a, bv20Var);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || yu20Var != null) {
            cldVarA.p(ugi0Var, 8, wu20.f39772a, yu20Var);
        }
        cldVarA.c(ugi0Var);
    }
}
