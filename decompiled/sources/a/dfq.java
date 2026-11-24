package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dfq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dfq f6011a;
    private static final ugi0 descriptor;

    static {
        dfq dfqVar = new dfq();
        f6011a = dfqVar;
        zna0 zna0Var = new zna0("org.xplatform.social.impl.socials.firebase_auth.entity.Firebase", dfqVar, 2);
        zna0Var.j("identities", true);
        zna0Var.j("sign_in_provider", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(nxw.f24302a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        pxw pxwVar = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                pxwVar = (pxw) bldVarA.e(ugi0Var, 0, nxw.f24302a, pxwVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ffq(i, pxwVar, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ffq ffqVar = (ffq) obj;
        ffqVar.getClass();
        String str = ffqVar.b;
        pxw pxwVar = ffqVar.f9458a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || pxwVar != null) {
            cldVarA.p(ugi0Var, 0, nxw.f24302a, pxwVar);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
