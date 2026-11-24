package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qvq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qvq f29397a;
    private static final ugi0 descriptor;

    static {
        qvq qvqVar = new qvq();
        f29397a = qvqVar;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.register_responses.FormFieldErrorResponse", qvqVar, 2);
        zna0Var.j("Key", true);
        zna0Var.j("Error", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) svq.c[0].getValue()), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = svq.c;
        boolean z = true;
        int i = 0;
        w0f0 w0f0Var = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                w0f0Var = (w0f0) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), w0f0Var);
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
        return new svq(i, w0f0Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        svq svqVar = (svq) obj;
        svqVar.getClass();
        String str = svqVar.b;
        w0f0 w0f0Var = svqVar.f32881a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = svq.c;
        if (cldVarA.u(ugi0Var) || w0f0Var != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), w0f0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
