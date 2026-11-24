package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7p implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z7p f43928a;
    private static final ugi0 descriptor;

    static {
        z7p z7pVar = new z7p();
        f43928a = z7pVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.bets_on_favorite.FavoriteEventResponse", z7pVar, 7);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("groupId", true);
        zna0Var.j("parameter", true);
        zna0Var.j("player", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(s710Var), mrv.j0(tblVar), mrv.j0(k9a0.f17906a), mrv.j0(b8p.f2166a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        String str = null;
        Long l2 = null;
        Double d2 = null;
        daa0 daa0Var = null;
        d8p d8pVar = null;
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
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    daa0Var = (daa0) bldVarA.e(ugi0Var, 5, k9a0.f17906a, daa0Var);
                    i |= 32;
                    break;
                case 6:
                    d8pVar = (d8p) bldVarA.e(ugi0Var, 6, b8p.f2166a, d8pVar);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new e8p(i, l, d, str, l2, d2, daa0Var, d8pVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e8p e8pVar = (e8p) obj;
        e8pVar.getClass();
        d8p d8pVar = e8pVar.g;
        daa0 daa0Var = e8pVar.f;
        Double d = e8pVar.e;
        Long l = e8pVar.d;
        String str = e8pVar.c;
        Double d2 = e8pVar.b;
        Long l2 = e8pVar.f7385a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || daa0Var != null) {
            cldVarA.p(ugi0Var, 5, k9a0.f17906a, daa0Var);
        }
        if (cldVarA.u(ugi0Var) || d8pVar != null) {
            cldVarA.p(ugi0Var, 6, b8p.f2166a, d8pVar);
        }
        cldVarA.c(ugi0Var);
    }
}
