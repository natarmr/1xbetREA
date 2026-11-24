package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u0a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0a0 f34847a;
    private static final ugi0 descriptor;

    static {
        u0a0 u0a0Var = new u0a0();
        f34847a = u0a0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.PlayerCommonItemResponse", u0a0Var, 3);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("timeSeconds", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
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
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new w0a0(i, num, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w0a0 w0a0Var = (w0a0) obj;
        w0a0Var.getClass();
        Integer num = w0a0Var.c;
        String str = w0a0Var.b;
        String str2 = w0a0Var.f38341a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
