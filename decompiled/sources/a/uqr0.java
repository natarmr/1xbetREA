package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uqr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uqr0 f36132a;
    private static final ugi0 descriptor;

    static {
        uqr0 uqr0Var = new uqr0();
        f36132a = uqr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_jackpot.impl.data.model.TotoJackpotTiragChampInfoResponse", uqr0Var, 5);
        zna0Var.j("ChampName", true);
        zna0Var.j("ChampId", true);
        zna0Var.j("ChampImage", true);
        zna0Var.j("ChampCountryImage", true);
        zna0Var.j("ChampCountryId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else if (iF == 3) {
                str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new wqr0(i, num, l, str, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wqr0 wqr0Var = (wqr0) obj;
        wqr0Var.getClass();
        Integer num = wqr0Var.e;
        String str = wqr0Var.d;
        String str2 = wqr0Var.c;
        Long l = wqr0Var.b;
        String str3 = wqr0Var.f39606a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
