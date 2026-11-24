package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n8h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n8h f23087a;
    private static final ugi0 descriptor;

    static {
        n8h n8hVar = new n8h();
        f23087a = n8hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.CyberMatchesStatisticBanPickResponse", n8hVar, 4);
        zna0Var.j("heroName", true);
        zna0Var.j("heroImageS3", true);
        zna0Var.j("isPick", true);
        zna0Var.j("isRadiant", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
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
                bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool2 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new p8h(i, str, str2, bool, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p8h p8hVar = (p8h) obj;
        p8hVar.getClass();
        Boolean bool = p8hVar.d;
        Boolean bool2 = p8hVar.c;
        String str = p8hVar.b;
        String str2 = p8hVar.f26553a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
