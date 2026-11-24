package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rsf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rsf0 f31029a;
    private static final ugi0 descriptor;

    static {
        rsf0 rsf0Var = new rsf0();
        f31029a = rsf0Var;
        zna0 zna0Var = new zna0("org.xplatform.app_update.impl.data.models.ResolveVersionResponse", rsf0Var, 2);
        zna0Var.j("v3", true);
        zna0Var.j("v4", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ybu0 ybu0Var = ybu0.f42356a;
        return new jiy[]{mrv.j0(ybu0Var), mrv.j0(ybu0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        acu0 acu0Var = null;
        acu0 acu0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                acu0Var = (acu0) bldVarA.e(ugi0Var, 0, ybu0.f42356a, acu0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                acu0Var2 = (acu0) bldVarA.e(ugi0Var, 1, ybu0.f42356a, acu0Var2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new tsf0(i, acu0Var, acu0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tsf0 tsf0Var = (tsf0) obj;
        tsf0Var.getClass();
        acu0 acu0Var = tsf0Var.b;
        acu0 acu0Var2 = tsf0Var.f34459a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || acu0Var2 != null) {
            cldVarA.p(ugi0Var, 0, ybu0.f42356a, acu0Var2);
        }
        if (cldVarA.u(ugi0Var) || acu0Var != null) {
            cldVarA.p(ugi0Var, 1, ybu0.f42356a, acu0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
