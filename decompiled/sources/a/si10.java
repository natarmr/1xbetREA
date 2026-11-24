package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class si10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final si10 f32242a;
    private static final ugi0 descriptor;

    static {
        si10 si10Var = new si10();
        f32242a = si10Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.loyalty_program.impl.data.models.LoyaltyProgramUserCashbackResponse", si10Var, 4);
        zna0Var.j("nextPayoutInSeconds", true);
        zna0Var.j("cashbackStatus", true);
        zna0Var.j("cashbackSum", true);
        zna0Var.j("userCurrency", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0(tbl.f33669a), mrv.j0(uh10.f35653a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Double d = null;
        wh10 wh10Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                wh10Var = (wh10) bldVarA.e(ugi0Var, 3, uh10.f35653a, wh10Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ui10(i, num, str, d, wh10Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ui10 ui10Var = (ui10) obj;
        ui10Var.getClass();
        wh10 wh10Var = ui10Var.d;
        Double d = ui10Var.c;
        String str = ui10Var.b;
        Integer num = ui10Var.f35708a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || wh10Var != null) {
            cldVarA.p(ugi0Var, 3, uh10.f35653a, wh10Var);
        }
        cldVarA.c(ugi0Var);
    }
}
