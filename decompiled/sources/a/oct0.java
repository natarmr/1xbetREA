package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oct0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oct0 f25045a;
    private static final ugi0 descriptor;

    static {
        oct0 oct0Var = new oct0();
        f25045a = oct0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.UniversalChampSocialMediaResponse.SocialItemVariant", oct0Var, 2);
        zna0Var.j("title", true);
        zna0Var.j("href", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(rct0.f30257a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        tct0 tct0Var = null;
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
                tct0Var = (tct0) bldVarA.e(ugi0Var, 1, rct0.f30257a, tct0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new qct0(i, str, tct0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qct0 qct0Var = (qct0) obj;
        qct0Var.getClass();
        tct0 tct0Var = qct0Var.b;
        String str = qct0Var.f28500a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || tct0Var != null) {
            cldVarA.p(ugi0Var, 1, rct0.f30257a, tct0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
