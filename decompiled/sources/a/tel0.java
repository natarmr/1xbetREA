package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tel0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tel0 f33826a;
    private static final ugi0 descriptor;

    static {
        tel0 tel0Var = new tel0();
        f33826a = tel0Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.sport.SportImageNewResponse", tel0Var, 2);
        zna0Var.j("typeName", true);
        zna0Var.j("images", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(nel0.f23391a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        rel0 rel0Var = null;
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
                rel0Var = (rel0) bldVarA.e(ugi0Var, 1, nel0.f23391a, rel0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xel0(i, str, rel0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xel0 xel0Var = (xel0) obj;
        xel0Var.getClass();
        rel0 rel0Var = xel0Var.b;
        String str = xel0Var.f40749a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || rel0Var != null) {
            cldVarA.p(ugi0Var, 1, nel0.f23391a, rel0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
