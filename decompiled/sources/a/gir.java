package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gir implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gir f11363a;
    private static final ugi0 descriptor;

    static {
        gir girVar = new gir();
        f11363a = girVar;
        zna0 zna0Var = new zna0("GPWebAppSwitchKeyboard", girVar, 4);
        zna0Var.j("requestId", true);
        zna0Var.j("isOpen", false);
        zna0Var.j("height", false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), sm8.f32432a, okx.f25427a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        String str = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                zB = bldVarA.B(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new iir(i, iJ, str, strX, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iir iirVar = (iir) obj;
        iirVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(iirVar, cldVarA, ugi0Var);
        boolean z = iirVar.c;
        String str = iirVar.e;
        cldVarA.x(ugi0Var, 1, z);
        cldVarA.i(2, iirVar.d, ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSwitchKeyboard")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
