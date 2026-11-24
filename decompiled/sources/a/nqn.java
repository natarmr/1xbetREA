package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nqn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nqn f23969a;
    private static final ugi0 descriptor;

    static {
        nqn nqnVar = new nqn();
        f23969a = nqnVar;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.data.models.EditProfileRequest", nqnVar, 7);
        zna0Var.j("Data", false);
        zna0Var.j("ImageText", false);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("Language", false);
        zna0Var.j("Partner", false);
        zna0Var.j("Group", false);
        zna0Var.j("Whence", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        return new jiy[]{pqn.h[0].getValue(), ysm0Var, ysm0Var, ysm0Var, okxVar, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pqn.h;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        xpn xpnVar = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    xpnVar = (xpn) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), xpnVar);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX3 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ2 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ3 = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new pqn(i, xpnVar, strX, strX2, strX3, iJ, iJ2, iJ3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pqn pqnVar = (pqn) obj;
        pqnVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) pqn.h[0].getValue(), pqnVar.f27422a);
        cldVarA.z(ugi0Var, 1, pqnVar.b);
        cldVarA.z(ugi0Var, 2, pqnVar.c);
        cldVarA.z(ugi0Var, 3, pqnVar.d);
        cldVarA.i(4, pqnVar.e, ugi0Var);
        cldVarA.i(5, pqnVar.f, ugi0Var);
        cldVarA.i(6, pqnVar.g, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
