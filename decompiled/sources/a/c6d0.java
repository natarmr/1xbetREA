package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c6d0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c6d0 f3813a;
    private static final ugi0 descriptor;

    static {
        c6d0 c6d0Var = new c6d0();
        f3813a = c6d0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexcore.data.network.ProxySettings", c6d0Var, 6);
        zna0Var.j("enabled", false);
        zna0Var.j("proxyType", false);
        zna0Var.j("server", false);
        zna0Var.j("port", false);
        zna0Var.j("username", false);
        zna0Var.j(ParameterNames.PASSWORD, false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = e6d0.g;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{sm8.f32432a, a8zVarArr[1].getValue(), ysm0Var, okx.f25427a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e6d0.g;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        int iJ = 0;
        t6d0 t6d0Var = null;
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
                    zB = bldVarA.B(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    t6d0Var = (t6d0) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), t6d0Var);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX2 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX3 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new e6d0(i, zB, t6d0Var, strX, iJ, strX2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e6d0 e6d0Var = (e6d0) obj;
        e6d0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = e6d0.g;
        cldVarA.x(ugi0Var, 0, e6d0Var.f7278a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), e6d0Var.b);
        cldVarA.z(ugi0Var, 2, e6d0Var.c);
        cldVarA.i(3, e6d0Var.d, ugi0Var);
        cldVarA.z(ugi0Var, 4, e6d0Var.e);
        cldVarA.z(ugi0Var, 5, e6d0Var.f);
        cldVarA.c(ugi0Var);
    }
}
