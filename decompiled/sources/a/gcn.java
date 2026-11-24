package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gcn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gcn f11072a;
    private static final ugi0 descriptor;

    static {
        gcn gcnVar = new gcn();
        f11072a = gcnVar;
        zna0 zna0Var = new zna0("org.xplatform.playersduel.impl.data.models.DuelGameEventGroupResponse.GameEvent", gcnVar, 8);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("cf", true);
        zna0Var.j("parameter", true);
        zna0Var.j("blocked", true);
        zna0Var.j("cfView", true);
        zna0Var.j("player", true);
        zna0Var.j("specialSign", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(tblVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0(lcn.f19806a), mrv.j0(sm8Var), mrv.j0(icn.f14544a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        Double d2 = null;
        Boolean bool = null;
        String str = null;
        ncn ncnVar = null;
        Boolean bool2 = null;
        kcn kcnVar = null;
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
                    ncnVar = (ncn) bldVarA.e(ugi0Var, 5, lcn.f19806a, ncnVar);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    kcnVar = (kcn) bldVarA.e(ugi0Var, 7, icn.f14544a, kcnVar);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ocn(i, l, d, d2, bool, str, ncnVar, bool2, kcnVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ocn ocnVar = (ocn) obj;
        ocnVar.getClass();
        kcn kcnVar = ocnVar.h;
        Boolean bool = ocnVar.g;
        ncn ncnVar = ocnVar.f;
        String str = ocnVar.e;
        Boolean bool2 = ocnVar.d;
        Double d = ocnVar.c;
        Double d2 = ocnVar.b;
        Long l = ocnVar.f25034a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
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
        if (cldVarA.u(ugi0Var) || ncnVar != null) {
            cldVarA.p(ugi0Var, 5, lcn.f19806a, ncnVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || kcnVar != null) {
            cldVarA.p(ugi0Var, 7, icn.f14544a, kcnVar);
        }
        cldVarA.c(ugi0Var);
    }
}
