package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u2c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2c f34939a;
    private static final ugi0 descriptor;

    static {
        u2c u2cVar = new u2c();
        f34939a = u2cVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.restore.models.CheckFormRequest.FieldRequest", u2cVar, 3);
        zna0Var.j("Key", true);
        zna0Var.j("Value", true);
        zna0Var.j("IsEmpty", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        boolean zB = false;
        String strX = null;
        String strX2 = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new w2c(i, strX, strX2, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w2c w2cVar = (w2c) obj;
        w2cVar.getClass();
        boolean z = w2cVar.c;
        String str = w2cVar.b;
        String str2 = w2cVar.f38440a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 0, str2);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.z(ugi0Var, 1, str);
        }
        if (cldVarA.u(ugi0Var) || z) {
            cldVarA.x(ugi0Var, 2, z);
        }
        cldVarA.c(ugi0Var);
    }
}
