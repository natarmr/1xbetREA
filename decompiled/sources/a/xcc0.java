package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xcc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xcc0 f40640a;
    private static final ugi0 descriptor;

    static {
        xcc0 xcc0Var = new xcc0();
        f40640a = xcc0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.PromoCodeConditionResponse", xcc0Var, 3);
        zna0Var.j("Key", true);
        zna0Var.j("Value", true);
        zna0Var.j("Name", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zcc0(str, i, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zcc0 zcc0Var = (zcc0) obj;
        zcc0Var.getClass();
        String str = zcc0Var.c;
        String str2 = zcc0Var.b;
        String str3 = zcc0Var.f44159a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
