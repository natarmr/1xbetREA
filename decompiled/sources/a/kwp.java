package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kwp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kwp f19013a;
    private static final ugi0 descriptor;

    static {
        kwp kwpVar = new kwp();
        f19013a = kwpVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.leaderboard.model.FighterResponse", kwpVar, 10);
        zna0Var.j("fighterID", true);
        zna0Var.j("feedId", true);
        zna0Var.j("feedName", true);
        zna0Var.j("firstName", true);
        zna0Var.j("lastName", true);
        zna0Var.j("nickname", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("position", true);
        zna0Var.j("record", true);
        zna0Var.j("rankChange", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(hwp.f13777a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num = null;
        boolean z = true;
        jwp jwpVar = null;
        int i = 0;
        Integer num2 = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    break;
                case 8:
                    jwpVar = (jwp) bldVarA.e(ugi0Var, 8, hwp.f13777a, jwpVar);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new mwp(i, num2, l, str, str2, str3, str4, str5, num3, jwpVar, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mwp mwpVar = (mwp) obj;
        mwpVar.getClass();
        Integer num = mwpVar.j;
        jwp jwpVar = mwpVar.i;
        Integer num2 = mwpVar.h;
        String str = mwpVar.g;
        String str2 = mwpVar.f;
        String str3 = mwpVar.e;
        String str4 = mwpVar.d;
        String str5 = mwpVar.c;
        Long l = mwpVar.b;
        Integer num3 = mwpVar.f22516a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || jwpVar != null) {
            cldVarA.p(ugi0Var, 8, hwp.f13777a, jwpVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
