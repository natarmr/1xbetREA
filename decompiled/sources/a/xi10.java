package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xi10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xi10 f40921a;
    private static final ugi0 descriptor;

    static {
        xi10 xi10Var = new xi10();
        f40921a = xi10Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.loyalty_program.impl.data.models.LoyaltyProgramUserInfoResponse", xi10Var, 6);
        zna0Var.j("levelNumber", true);
        zna0Var.j("userExperience", true);
        zna0Var.j("nextPayoutInSeconds", true);
        zna0Var.j("cashbackStatus", true);
        zna0Var.j("cashbackSum", true);
        zna0Var.j("userCurrency", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(tbl.f33669a), mrv.j0(uh10.f35653a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        Double d = null;
        wh10 wh10Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    d = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d);
                    i |= 16;
                    break;
                case 5:
                    wh10Var = (wh10) bldVarA.e(ugi0Var, 5, uh10.f35653a, wh10Var);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new zi10(i, num, num2, num3, str, d, wh10Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zi10 zi10Var = (zi10) obj;
        zi10Var.getClass();
        wh10 wh10Var = zi10Var.f;
        Double d = zi10Var.e;
        String str = zi10Var.d;
        Integer num = zi10Var.c;
        Integer num2 = zi10Var.b;
        Integer num3 = zi10Var.f44419a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || wh10Var != null) {
            cldVarA.p(ugi0Var, 5, uh10.f35653a, wh10Var);
        }
        cldVarA.c(ugi0Var);
    }
}
