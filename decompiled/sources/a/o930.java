package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o930 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o930 f24861a;
    private static final ugi0 descriptor;

    static {
        o930 o930Var = new o930();
        f24861a = o930Var;
        zna0 zna0Var = new zna0("org.xplatform.currentdomain.impl.data.model.MatchDomain", o930Var, 2);
        zna0Var.j("dataHex", true);
        zna0Var.j("ivHex", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new q930(i, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q930 q930Var = (q930) obj;
        q930Var.getClass();
        String str = q930Var.b;
        String str2 = q930Var.f28328a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
