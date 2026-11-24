package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mpf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mpf f22177a;
    private static final ugi0 descriptor;

    static {
        mpf mpfVar = new mpf();
        f22177a = mpfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.counterstrike.impl.data.model.mapsPicks.Cs2MapsStatisticResponse", mpfVar, 5);
        zna0Var.j("mapTitle", true);
        zna0Var.j("winrate", true);
        zna0Var.j("count", true);
        zna0Var.j("isPick", true);
        zna0Var.j("isBan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(okx.f25427a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(sm8Var)};
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
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool2 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new opf(i, str, str2, num, bool, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        opf opfVar = (opf) obj;
        opfVar.getClass();
        Boolean bool = opfVar.e;
        Boolean bool2 = opfVar.d;
        Integer num = opfVar.c;
        String str = opfVar.b;
        String str2 = opfVar.f25638a;
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
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
