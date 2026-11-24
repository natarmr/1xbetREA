package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v29 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v29 f36672a;
    private static final ugi0 descriptor;

    static {
        v29 v29Var = new v29();
        f36672a = v29Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.earned_points.data.model.BreakdownResponse", v29Var, 5);
        zna0Var.j("date", true);
        zna0Var.j("dropDate", true);
        zna0Var.j("points", true);
        zna0Var.j("round", true);
        zna0Var.j("tournamentTitle", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
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
        return new x29(i, l, l2, num, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x29 x29Var = (x29) obj;
        x29Var.getClass();
        String str = x29Var.e;
        String str2 = x29Var.d;
        Integer num = x29Var.c;
        Long l = x29Var.b;
        Long l2 = x29Var.f40156a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
