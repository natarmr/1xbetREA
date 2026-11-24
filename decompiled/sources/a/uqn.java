package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uqn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uqn f36127a;
    private static final ugi0 descriptor;

    static {
        uqn uqnVar = new uqn();
        f36127a = uqnVar;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.data.models.EditProfileSettingsRequest", uqnVar, 3);
        zna0Var.j("Data", false);
        zna0Var.j("ImageText", false);
        zna0Var.j("CaptchaId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{wqn.d[0].getValue(), ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wqn.d;
        boolean z = true;
        int i = 0;
        hrn hrnVar = null;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hrnVar = (hrn) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), hrnVar);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wqn(i, hrnVar, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wqn wqnVar = (wqn) obj;
        wqnVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) wqn.d[0].getValue(), wqnVar.f39599a);
        cldVarA.z(ugi0Var, 1, wqnVar.b);
        cldVarA.z(ugi0Var, 2, wqnVar.c);
        cldVarA.c(ugi0Var);
    }
}
