package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zgr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zgr f44357a;
    private static final ugi0 descriptor;

    static {
        zgr zgrVar = new zgr();
        f44357a = zgrVar;
        zna0 zna0Var = new zna0("GPWebAppSetGameUnderMaintenance", zgrVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), okx.f25427a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
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
                iJ = bldVarA.j(ugi0Var, 1);
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
        return new bhr(i, str, iJ, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bhr bhrVar = (bhr) obj;
        bhrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(bhrVar, cldVarA, ugi0Var);
        int i = bhrVar.c;
        String str = bhrVar.d;
        cldVarA.i(1, i, ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetGameUnderMaintenance")) {
            cldVarA.z(ugi0Var, 2, str);
        }
        cldVarA.c(ugi0Var);
    }
}
