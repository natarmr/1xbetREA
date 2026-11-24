package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lng0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lng0 f20344a;
    private static final ugi0 descriptor;

    static {
        lng0 lng0Var = new lng0();
        f20344a = lng0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.RulesStageItemResponse", lng0Var, 5);
        zna0Var.j(RemoteMessageConst.Notification.CONTENT, true);
        zna0Var.j("crmStageId", true);
        zna0Var.j("stageEndAt", true);
        zna0Var.j("stageStartAt", true);
        zna0Var.j("subContent", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            } else if (iF == 3) {
                l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new nng0(i, str, l, l2, l3, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nng0 nng0Var = (nng0) obj;
        nng0Var.getClass();
        String str = nng0Var.e;
        Long l = nng0Var.d;
        Long l2 = nng0Var.c;
        Long l3 = nng0Var.b;
        String str2 = nng0Var.f23819a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
