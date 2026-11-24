package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nyr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nyr0 f24343a;
    private static final ugi0 descriptor;

    static {
        nyr0 nyr0Var = new nyr0();
        f24343a = nyr0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.TournamentCardResponse", nyr0Var, 7);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("kind", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("providerTournamentWithStages", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("blockImage", true);
        zna0Var.j("blockHeader", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0(ryr0.f31327a), mrv.j0(oyr0.f26072a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Integer num3 = null;
        tyr0 tyr0Var = null;
        qyr0 qyr0Var = null;
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
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    tyr0Var = (tyr0) bldVarA.e(ugi0Var, 5, ryr0.f31327a, tyr0Var);
                    i |= 32;
                    break;
                case 6:
                    qyr0Var = (qyr0) bldVarA.e(ugi0Var, 6, oyr0.f26072a, qyr0Var);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new bzr0(i, l, num, num2, bool, num3, tyr0Var, qyr0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bzr0 bzr0Var = (bzr0) obj;
        bzr0Var.getClass();
        qyr0 qyr0Var = bzr0Var.g;
        tyr0 tyr0Var = bzr0Var.f;
        Integer num = bzr0Var.e;
        Boolean bool = bzr0Var.d;
        Integer num2 = bzr0Var.c;
        Integer num3 = bzr0Var.b;
        Long l = bzr0Var.f3486a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || tyr0Var != null) {
            cldVarA.p(ugi0Var, 5, ryr0.f31327a, tyr0Var);
        }
        if (cldVarA.u(ugi0Var) || qyr0Var != null) {
            cldVarA.p(ugi0Var, 6, oyr0.f26072a, qyr0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
