package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vrd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vrd0 f37895a;
    private static final ugi0 descriptor;

    static {
        vrd0 vrd0Var = new vrd0();
        f37895a = vrd0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stat_results.impl.results.races.data.models.RaceResultResponse", vrd0Var, 8);
        zna0Var.j("player", true);
        zna0Var.j("team", true);
        zna0Var.j("place", true);
        zna0Var.j("grid", true);
        zna0Var.j("laps", true);
        zna0Var.j("duration", true);
        zna0Var.j("pits", true);
        zna0Var.j("points", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Integer num2 = null;
        String str4 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
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
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    break;
                case 7:
                    num4 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num4);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new xrd0(i, str, str2, num, str3, num2, str4, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xrd0 xrd0Var = (xrd0) obj;
        xrd0Var.getClass();
        Integer num = xrd0Var.h;
        Integer num2 = xrd0Var.g;
        String str = xrd0Var.f;
        Integer num3 = xrd0Var.e;
        String str2 = xrd0Var.d;
        Integer num4 = xrd0Var.c;
        String str3 = xrd0Var.b;
        String str4 = xrd0Var.f41365a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
