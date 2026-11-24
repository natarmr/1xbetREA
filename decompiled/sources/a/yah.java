package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yah implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yah f42297a;
    private static final ugi0 descriptor;

    static {
        yah yahVar = new yah();
        f42297a = yahVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.feed.data.model.CyberRealTopChampsResponse", yahVar, 7);
        zna0Var.j("liga", true);
        zna0Var.j("countryId", true);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("lineGamesCount", true);
        zna0Var.j("liveGamesCount", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(c2g.f3621a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        j26 j26Var = j26.f15767a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(j26Var), mrv.j0(j26Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        e2g e2gVar = null;
        Integer num = null;
        l26 l26Var = null;
        l26 l26Var2 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    e2gVar = (e2g) bldVarA.e(ugi0Var, 0, c2g.f3621a, e2gVar);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    l26Var = (l26) bldVarA.e(ugi0Var, 2, j26.f15767a, l26Var);
                    i |= 4;
                    break;
                case 3:
                    l26Var2 = (l26) bldVarA.e(ugi0Var, 3, j26.f15767a, l26Var2);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new abh(i, e2gVar, num, l26Var, l26Var2, num2, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        abh abhVar = (abh) obj;
        abhVar.getClass();
        Integer num = abhVar.g;
        Integer num2 = abhVar.f;
        Integer num3 = abhVar.e;
        l26 l26Var = abhVar.d;
        l26 l26Var2 = abhVar.c;
        Integer num4 = abhVar.b;
        e2g e2gVar = abhVar.f579a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || e2gVar != null) {
            cldVarA.p(ugi0Var, 0, c2g.f3621a, e2gVar);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l26Var2 != null) {
            cldVarA.p(ugi0Var, 2, j26.f15767a, l26Var2);
        }
        if (cldVarA.u(ugi0Var) || l26Var != null) {
            cldVarA.p(ugi0Var, 3, j26.f15767a, l26Var);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
