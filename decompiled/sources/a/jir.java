package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jir implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jir f16589a;
    private static final ugi0 descriptor;

    static {
        jir jirVar = new jir();
        f16589a = jirVar;
        zna0 zna0Var = new zna0("GPWebAppSwitchTheme", jirVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j("theme", false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lir.e;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), a8zVarArr[1].getValue(), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lir.e;
        boolean z = true;
        int i = 0;
        String str = null;
        ajr ajrVar = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                ajrVar = (ajr) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), ajrVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new lir(i, str, ajrVar, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lir lirVar = (lir) obj;
        lirVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(lirVar, cldVarA, ugi0Var);
        jiy jiyVar = (jiy) lir.e[1].getValue();
        ajr ajrVar = lirVar.c;
        String str = lirVar.d;
        cldVarA.m(ugi0Var, 1, jiyVar, ajrVar);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSwitchTheme")) {
            cldVarA.z(ugi0Var, 2, str);
        }
        cldVarA.c(ugi0Var);
    }
}
