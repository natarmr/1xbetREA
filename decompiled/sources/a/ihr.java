package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ihr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ihr f14794a;
    private static final ugi0 descriptor;

    static {
        ihr ihrVar = new ihr();
        f14794a = ihrVar;
        zna0 zna0Var = new zna0("GPWebAppSetRoute", ihrVar, 4);
        zna0Var.j("requestId", true);
        zna0Var.j("name", false);
        zna0Var.j("params", true);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = khr.f;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), a8zVarArr[1].getValue(), mrv.j0(uir.f35746a), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = khr.f;
        boolean z = true;
        int i = 0;
        String str = null;
        yir yirVar = null;
        wir wirVar = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                yirVar = (yir) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), yirVar);
                i |= 2;
            } else if (iF == 2) {
                wirVar = (wir) bldVarA.e(ugi0Var, 2, uir.f35746a, wirVar);
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
        return new khr(i, str, yirVar, wirVar, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        khr khrVar = (khr) obj;
        khrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(khrVar, cldVarA, ugi0Var);
        jiy jiyVar = (jiy) khr.f[1].getValue();
        yir yirVar = khrVar.c;
        String str = khrVar.e;
        wir wirVar = khrVar.d;
        cldVarA.m(ugi0Var, 1, jiyVar, yirVar);
        if (cldVarA.u(ugi0Var) || wirVar != null) {
            cldVarA.p(ugi0Var, 2, uir.f35746a, wirVar);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetRoute")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
