package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ids0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ids0 f14601a;
    private static final ugi0 descriptor;

    static {
        ids0 ids0Var = new ids0();
        f14601a = ids0Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.TrackerModel", ids0Var, 3);
        zna0Var.j("fatman_uuid", true);
        zna0Var.j("appp_download_id", true);
        zna0Var.j("referral", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(yne0.f42937a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        aoe0 aoe0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                aoe0Var = (aoe0) bldVarA.e(ugi0Var, 2, yne0.f42937a, aoe0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new kds0(i, str, str2, aoe0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kds0 kds0Var = (kds0) obj;
        kds0Var.getClass();
        aoe0 aoe0Var = kds0Var.c;
        String str = kds0Var.b;
        String str2 = kds0Var.f18121a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || aoe0Var != null) {
            cldVarA.p(ugi0Var, 2, yne0.f42937a, aoe0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
