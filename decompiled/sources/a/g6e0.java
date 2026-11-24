package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g6e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g6e0 f10760a;
    private static final ugi0 descriptor;

    static {
        g6e0 g6e0Var = new g6e0();
        f10760a = g6e0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.rating.impl.rating_history.data.model.RatingResponse", g6e0Var, 11);
        zna0Var.j("rank", true);
        zna0Var.j("year", true);
        zna0Var.j("month", true);
        zna0Var.j("bestRanking", true);
        zna0Var.j("worstRanking", true);
        zna0Var.j("bestMove", true);
        zna0Var.j("worstMove", true);
        zna0Var.j("isWorstRanking", true);
        zna0Var.j("isBestRanking", true);
        zna0Var.j("isWorstMover", true);
        zna0Var.j("isBestMover", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = true;
        Boolean bool3 = null;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Boolean bool4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i |= 64;
                    break;
                case 7:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool4);
                    i |= 128;
                    break;
                case 8:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool3);
                    i |= 256;
                    break;
                case 9:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new k6e0(i, num, num2, str, num3, num4, num5, num6, bool4, bool3, bool2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k6e0 k6e0Var = (k6e0) obj;
        k6e0Var.getClass();
        Boolean bool = k6e0Var.k;
        Boolean bool2 = k6e0Var.j;
        Boolean bool3 = k6e0Var.i;
        Boolean bool4 = k6e0Var.h;
        Integer num = k6e0Var.g;
        Integer num2 = k6e0Var.f;
        Integer num3 = k6e0Var.e;
        Integer num4 = k6e0Var.d;
        String str = k6e0Var.c;
        Integer num5 = k6e0Var.b;
        Integer num6 = k6e0Var.f17765a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num4);
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
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
