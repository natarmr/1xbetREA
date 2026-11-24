package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jdo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jdo f16338a;
    private static final ugi0 descriptor;

    static {
        jdo jdoVar = new jdo();
        f16338a = jdoVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.bets_on_players.impl.data.model.EventGroupResponse.GameEvent", jdoVar, 7);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("cf", true);
        zna0Var.j("parameter", true);
        zna0Var.j("blocked", true);
        zna0Var.j("cfView", true);
        zna0Var.j("player", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(sm8.f32432a), mrv.j0(ysm0.f43175a), mrv.j0(odo.f25084a), mrv.j0(ldo.f19860a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        Double d2 = null;
        Boolean bool = null;
        String str = null;
        qdo qdoVar = null;
        ndo ndoVar = null;
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
                    qdoVar = (qdo) bldVarA.e(ugi0Var, 5, odo.f25084a, qdoVar);
                    i |= 32;
                    break;
                case 6:
                    ndoVar = (ndo) bldVarA.e(ugi0Var, 6, ldo.f19860a, ndoVar);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new rdo(i, l, d, d2, bool, str, qdoVar, ndoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rdo rdoVar = (rdo) obj;
        rdoVar.getClass();
        ndo ndoVar = rdoVar.g;
        qdo qdoVar = rdoVar.f;
        String str = rdoVar.e;
        Boolean bool = rdoVar.d;
        Double d = rdoVar.c;
        Double d2 = rdoVar.b;
        Long l = rdoVar.f30298a;
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
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || qdoVar != null) {
            cldVarA.p(ugi0Var, 5, odo.f25084a, qdoVar);
        }
        if (cldVarA.u(ugi0Var) || ndoVar != null) {
            cldVarA.p(ugi0Var, 6, ldo.f19860a, ndoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
