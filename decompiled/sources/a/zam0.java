package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zam0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zam0 f44077a;
    private static final ugi0 descriptor;

    static {
        zam0 zam0Var = new zam0();
        f44077a = zam0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.winter_games.impl.personal_statistic.data.model.StatisticByYearResponse", zam0Var, 5);
        zna0Var.j("season", true);
        zna0Var.j("shootingPerc", true);
        zna0Var.j("pronePerc", true);
        zna0Var.j("standingPerc", true);
        zna0Var.j("skiingPerc", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else if (iF == 3) {
                num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new bbm0(i, num, num2, num3, num4, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bbm0 bbm0Var = (bbm0) obj;
        bbm0Var.getClass();
        Integer num = bbm0Var.e;
        Integer num2 = bbm0Var.d;
        Integer num3 = bbm0Var.c;
        Integer num4 = bbm0Var.b;
        String str = bbm0Var.f2315a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
