package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r0f0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0f0 f29626a;
    private static final ugi0 descriptor;

    static {
        r0f0 r0f0Var = new r0f0();
        f29626a = r0f0Var;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.fields_response.RegistrationFieldResponse", r0f0Var, 4);
        zna0Var.j("Key", true);
        zna0Var.j("IsRequired", true);
        zna0Var.j("IsHidden", true);
        zna0Var.j("Rules", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) t0f0.e[0].getValue());
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ymg0.f42887a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = t0f0.e;
        boolean z = true;
        int i = 0;
        w0f0 w0f0Var = null;
        Boolean bool = null;
        Boolean bool2 = null;
        ang0 ang0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                w0f0Var = (w0f0) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), w0f0Var);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                bool2 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                ang0Var = (ang0) bldVarA.e(ugi0Var, 3, ymg0.f42887a, ang0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new t0f0(i, w0f0Var, bool, bool2, ang0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t0f0 t0f0Var = (t0f0) obj;
        t0f0Var.getClass();
        ang0 ang0Var = t0f0Var.d;
        Boolean bool = t0f0Var.c;
        Boolean bool2 = t0f0Var.b;
        w0f0 w0f0Var = t0f0Var.f33116a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = t0f0.e;
        if (cldVarA.u(ugi0Var) || w0f0Var != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), w0f0Var);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || ang0Var != null) {
            cldVarA.p(ugi0Var, 3, ymg0.f42887a, ang0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
