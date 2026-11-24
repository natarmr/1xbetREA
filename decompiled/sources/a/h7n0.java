package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h7n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h7n0 f12585a;
    private static final ugi0 descriptor;

    static {
        h7n0 h7n0Var = new h7n0();
        f12585a = h7n0Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.subscriptions.data.models.SubscriptionEventResponse", h7n0Var, 8);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("blocked", true);
        zna0Var.j("player", true);
        zna0Var.j("parameter", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(e7n0.f7335a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(b7n0.f2119a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Boolean bool = null;
        g7n0 g7n0Var = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        Boolean bool2 = null;
        d7n0 d7n0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    g7n0Var = (g7n0) bldVarA.e(ugi0Var, 2, e7n0.f7335a, g7n0Var);
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
                    d7n0Var = (d7n0) bldVarA.e(ugi0Var, 7, b7n0.f2119a, d7n0Var);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new j7n0(i, l, bool, g7n0Var, d, d2, str, bool2, d7n0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j7n0 j7n0Var = (j7n0) obj;
        j7n0Var.getClass();
        d7n0 d7n0Var = j7n0Var.h;
        Boolean bool = j7n0Var.g;
        String str = j7n0Var.f;
        Double d = j7n0Var.e;
        Double d2 = j7n0Var.d;
        g7n0 g7n0Var = j7n0Var.c;
        Boolean bool2 = j7n0Var.b;
        Long l = j7n0Var.f16050a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || g7n0Var != null) {
            cldVarA.p(ugi0Var, 2, e7n0.f7335a, g7n0Var);
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
        if (cldVarA.u(ugi0Var) || d7n0Var != null) {
            cldVarA.p(ugi0Var, 7, b7n0.f2119a, d7n0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
