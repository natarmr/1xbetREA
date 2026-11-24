package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yc90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yc90 f42376a;
    private static final ugi0 descriptor;

    static {
        yc90 yc90Var = new yc90();
        f42376a = yc90Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.PenaltyResponse.Shot", yc90Var, 2);
        zna0Var.j("teamId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ad90(i, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ad90 ad90Var = (ad90) obj;
        ad90Var.getClass();
        Boolean bool = ad90Var.b;
        Integer num = ad90Var.f667a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
