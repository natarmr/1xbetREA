package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zsw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsw f44927a;
    private static final ugi0 descriptor;

    static {
        zsw zswVar = new zsw();
        f44927a = zswVar;
        zna0 zna0Var = new zna0("org.xplatform.rules.api.data.models.HrefResponse", zswVar, 4);
        zna0Var.j("link", true);
        zna0Var.j("deeplink", true);
        zna0Var.j("title", true);
        zna0Var.j("img", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX4 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new btw(i, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        btw btwVar = (btw) obj;
        btwVar.getClass();
        String str = btwVar.d;
        String str2 = btwVar.c;
        String str3 = btwVar.b;
        String str4 = btwVar.f3203a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str4, "")) {
            cldVarA.z(ugi0Var, 0, str4);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str3, "")) {
            cldVarA.z(ugi0Var, 1, str3);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 2, str2);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
