package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k6i0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k6i0 f17772a;
    private static final ugi0 descriptor;

    static {
        k6i0 k6i0Var = new k6i0();
        f17772a = k6i0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.rating.impl.rating_statistic.data.model.SelectorsResponse", k6i0Var, 9);
        zna0Var.j("group", true);
        zna0Var.j("season", true);
        zna0Var.j("date", true);
        zna0Var.j("discipline", true);
        zna0Var.j("age", true);
        zna0Var.j("tournamentType", true);
        zna0Var.j("competitorType", true);
        zna0Var.j("tournament", true);
        zna0Var.j("limit", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        q5i0 q5i0Var = q5i0.f28154a;
        return new jiy[]{mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var), mrv.j0(q5i0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        w5i0 w5i0Var = null;
        w5i0 w5i0Var2 = null;
        w5i0 w5i0Var3 = null;
        w5i0 w5i0Var4 = null;
        w5i0 w5i0Var5 = null;
        w5i0 w5i0Var6 = null;
        w5i0 w5i0Var7 = null;
        w5i0 w5i0Var8 = null;
        w5i0 w5i0Var9 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    w5i0Var2 = (w5i0) bldVarA.e(ugi0Var, 0, q5i0.f28154a, w5i0Var2);
                    i |= 1;
                    break;
                case 1:
                    w5i0Var3 = (w5i0) bldVarA.e(ugi0Var, 1, q5i0.f28154a, w5i0Var3);
                    i |= 2;
                    break;
                case 2:
                    w5i0Var4 = (w5i0) bldVarA.e(ugi0Var, 2, q5i0.f28154a, w5i0Var4);
                    i |= 4;
                    break;
                case 3:
                    w5i0Var5 = (w5i0) bldVarA.e(ugi0Var, 3, q5i0.f28154a, w5i0Var5);
                    i |= 8;
                    break;
                case 4:
                    w5i0Var6 = (w5i0) bldVarA.e(ugi0Var, 4, q5i0.f28154a, w5i0Var6);
                    i |= 16;
                    break;
                case 5:
                    w5i0Var7 = (w5i0) bldVarA.e(ugi0Var, 5, q5i0.f28154a, w5i0Var7);
                    i |= 32;
                    break;
                case 6:
                    w5i0Var8 = (w5i0) bldVarA.e(ugi0Var, 6, q5i0.f28154a, w5i0Var8);
                    i |= 64;
                    break;
                case 7:
                    w5i0Var9 = (w5i0) bldVarA.e(ugi0Var, 7, q5i0.f28154a, w5i0Var9);
                    i |= 128;
                    break;
                case 8:
                    w5i0Var = (w5i0) bldVarA.e(ugi0Var, 8, q5i0.f28154a, w5i0Var);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new o6i0(i, w5i0Var2, w5i0Var3, w5i0Var4, w5i0Var5, w5i0Var6, w5i0Var7, w5i0Var8, w5i0Var9, w5i0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o6i0 o6i0Var = (o6i0) obj;
        o6i0Var.getClass();
        w5i0 w5i0Var = o6i0Var.i;
        w5i0 w5i0Var2 = o6i0Var.h;
        w5i0 w5i0Var3 = o6i0Var.g;
        w5i0 w5i0Var4 = o6i0Var.f;
        w5i0 w5i0Var5 = o6i0Var.e;
        w5i0 w5i0Var6 = o6i0Var.d;
        w5i0 w5i0Var7 = o6i0Var.c;
        w5i0 w5i0Var8 = o6i0Var.b;
        w5i0 w5i0Var9 = o6i0Var.f24738a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || w5i0Var9 != null) {
            cldVarA.p(ugi0Var, 0, q5i0.f28154a, w5i0Var9);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var8 != null) {
            cldVarA.p(ugi0Var, 1, q5i0.f28154a, w5i0Var8);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var7 != null) {
            cldVarA.p(ugi0Var, 2, q5i0.f28154a, w5i0Var7);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var6 != null) {
            cldVarA.p(ugi0Var, 3, q5i0.f28154a, w5i0Var6);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var5 != null) {
            cldVarA.p(ugi0Var, 4, q5i0.f28154a, w5i0Var5);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var4 != null) {
            cldVarA.p(ugi0Var, 5, q5i0.f28154a, w5i0Var4);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var3 != null) {
            cldVarA.p(ugi0Var, 6, q5i0.f28154a, w5i0Var3);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var2 != null) {
            cldVarA.p(ugi0Var, 7, q5i0.f28154a, w5i0Var2);
        }
        if (cldVarA.u(ugi0Var) || w5i0Var != null) {
            cldVarA.p(ugi0Var, 8, q5i0.f28154a, w5i0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
