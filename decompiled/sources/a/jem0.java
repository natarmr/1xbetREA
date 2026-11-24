package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jem0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jem0 f16382a;
    private static final ugi0 descriptor;

    static {
        jem0 jem0Var = new jem0();
        f16382a = jem0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.best_games.StatisticInfoResponse", jem0Var, 7);
        zna0Var.j("hasStatRatingTables", true);
        zna0Var.j("gameId", true);
        zna0Var.j("stageId", true);
        zna0Var.j("stageType", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("hasLineUps", true);
        zna0Var.j("hasStadiumInfo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ0 = mrv.j0(sm8Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool2);
                    i |= 32;
                    break;
                case 6:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool3);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new pem0(i, bool, str, str2, l, l2, bool2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pem0 pem0Var = (pem0) obj;
        pem0Var.getClass();
        Boolean bool = pem0Var.g;
        Boolean bool2 = pem0Var.f;
        Long l = pem0Var.e;
        Long l2 = pem0Var.d;
        String str = pem0Var.c;
        String str2 = pem0Var.b;
        Boolean bool3 = pem0Var.f26862a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
