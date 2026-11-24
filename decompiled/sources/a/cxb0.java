package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cxb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cxb0 f5116a;
    private static final ugi0 descriptor;

    static {
        cxb0 cxb0Var = new cxb0();
        f5116a = cxb0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.cyber_info.common.data.model.PrizeDistributionResponse", cxb0Var, 3);
        zna0Var.j("place", true);
        zna0Var.j("prize", true);
        zna0Var.j("team", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a), mrv.j0(exb0.f8570a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        gxb0 gxb0Var = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                gxb0Var = (gxb0) bldVarA.e(ugi0Var, 2, exb0.f8570a, gxb0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new hxb0(i, str, l, gxb0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hxb0 hxb0Var = (hxb0) obj;
        hxb0Var.getClass();
        gxb0 gxb0Var = hxb0Var.c;
        Long l = hxb0Var.b;
        String str = hxb0Var.f13808a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || gxb0Var != null) {
            cldVarA.p(ugi0Var, 2, exb0.f8570a, gxb0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
