package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iem0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iem0 f14641a;
    private static final ugi0 descriptor;

    static {
        iem0 iem0Var = new iem0();
        f14641a = iem0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.StatisticInfoResponse", iem0Var, 5);
        zna0Var.j("gameId", true);
        zna0Var.j("hasStadiumInfo", true);
        zna0Var.j("hasStatEvents", true);
        zna0Var.j("hasStatRatingTables", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                bool2 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool2);
                i |= 4;
            } else if (iF == 3) {
                bool3 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new oem0(i, str, bool, bool2, bool3, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oem0 oem0Var = (oem0) obj;
        oem0Var.getClass();
        Integer num = oem0Var.e;
        Boolean bool = oem0Var.d;
        Boolean bool2 = oem0Var.c;
        Boolean bool3 = oem0Var.b;
        String str = oem0Var.f25130a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
