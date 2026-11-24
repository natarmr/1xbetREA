package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hr3 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hr3 f13511a;
    private static final ugi0 descriptor;

    static {
        hr3 hr3Var = new hr3();
        f13511a = hr3Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.Application", hr3Var, 5);
        zna0Var.j("channel", true);
        zna0Var.j("name", true);
        zna0Var.j("version", true);
        zna0Var.j("os", true);
        zna0Var.j("device", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(mv90.f22446a), mrv.j0(ogk.f25223a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        pv90 pv90Var = null;
        qgk qgkVar = null;
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
            } else if (iF == 2) {
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else if (iF == 3) {
                pv90Var = (pv90) bldVarA.e(ugi0Var, 3, mv90.f22446a, pv90Var);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                qgkVar = (qgk) bldVarA.e(ugi0Var, 4, ogk.f25223a, qgkVar);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new jr3(i, str, str2, str3, pv90Var, qgkVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jr3 jr3Var = (jr3) obj;
        jr3Var.getClass();
        qgk qgkVar = jr3Var.e;
        pv90 pv90Var = jr3Var.d;
        String str = jr3Var.c;
        String str2 = jr3Var.b;
        String str3 = jr3Var.f16982a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || pv90Var != null) {
            cldVarA.p(ugi0Var, 3, mv90.f22446a, pv90Var);
        }
        if (cldVarA.u(ugi0Var) || qgkVar != null) {
            cldVarA.p(ugi0Var, 4, ogk.f25223a, qgkVar);
        }
        cldVarA.c(ugi0Var);
    }
}
