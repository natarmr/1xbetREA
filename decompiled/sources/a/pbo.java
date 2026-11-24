package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pbo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pbo f26717a;
    private static final ugi0 descriptor;

    static {
        pbo pboVar = new pbo();
        f26717a = pboVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.dayexpress.impl.data.model.EventDetailsResponse", pboVar, 8);
        zna0Var.j("groupId", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("parameter", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("player", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(rhj.f30493a), mrv.j0(sm8.f32432a), mrv.j0(rbo.f30198a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        thj thjVar = null;
        Boolean bool = null;
        tbo tboVar = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    thjVar = (thj) bldVarA.e(ugi0Var, 5, rhj.f30493a, thjVar);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                case 7:
                    tboVar = (tbo) bldVarA.e(ugi0Var, 7, rbo.f30198a, tboVar);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ubo(i, l, l2, d, d2, str, thjVar, bool, tboVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ubo uboVar = (ubo) obj;
        uboVar.getClass();
        tbo tboVar = uboVar.h;
        Boolean bool = uboVar.g;
        thj thjVar = uboVar.f;
        String str = uboVar.e;
        Double d = uboVar.d;
        Double d2 = uboVar.c;
        Long l = uboVar.b;
        Long l2 = uboVar.f35391a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || thjVar != null) {
            cldVarA.p(ugi0Var, 5, rhj.f30493a, thjVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || tboVar != null) {
            cldVarA.p(ugi0Var, 7, rbo.f30198a, tboVar);
        }
        cldVarA.c(ugi0Var);
    }
}
