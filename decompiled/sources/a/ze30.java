package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ze30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ze30 f44235a;
    private static final ugi0 descriptor;

    static {
        ze30 ze30Var = new ze30();
        f44235a = ze30Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.MatchReviewEventsResponse.EventResponse", ze30Var, 8);
        zna0Var.j("eventType", true);
        zna0Var.j("eventName", true);
        zna0Var.j("eventImage", true);
        zna0Var.j("minute", true);
        zna0Var.j("side", true);
        zna0Var.j("player", true);
        zna0Var.j("secondPlayer", true);
        zna0Var.j("description", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        bf30 bf30Var = bf30.f2482a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(bf30Var), mrv.j0(bf30Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        df30 df30Var = null;
        df30 df30Var2 = null;
        String str4 = null;
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
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    df30Var = (df30) bldVarA.e(ugi0Var, 5, bf30.f2482a, df30Var);
                    i |= 32;
                    break;
                case 6:
                    df30Var2 = (df30) bldVarA.e(ugi0Var, 6, bf30.f2482a, df30Var2);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new hf30(i, num, str, str2, str3, num2, df30Var, df30Var2, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hf30 hf30Var = (hf30) obj;
        hf30Var.getClass();
        String str = hf30Var.h;
        df30 df30Var = hf30Var.g;
        df30 df30Var2 = hf30Var.f;
        Integer num = hf30Var.e;
        String str2 = hf30Var.d;
        String str3 = hf30Var.c;
        String str4 = hf30Var.b;
        Integer num2 = hf30Var.f12953a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || df30Var2 != null) {
            cldVarA.p(ugi0Var, 5, bf30.f2482a, df30Var2);
        }
        if (cldVarA.u(ugi0Var) || df30Var != null) {
            cldVarA.p(ugi0Var, 6, bf30.f2482a, df30Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
