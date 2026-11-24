package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zxk implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zxk f45163a;
    private static final ugi0 descriptor;

    static {
        zxk zxkVar = new zxk();
        f45163a = zxkVar;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.data.models.DocumentResponse", zxkVar, 3);
        zna0Var.j("Id", true);
        zna0Var.j("Title", true);
        zna0Var.j("MinAge", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new byk(i, num, num2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        byk bykVar = (byk) obj;
        bykVar.getClass();
        Integer num = bykVar.c;
        String str = bykVar.b;
        Integer num2 = bykVar.f3423a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
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
