package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gn7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gn7 f11572a;
    private static final ugi0 descriptor;

    static {
        gn7 gn7Var = new gn7();
        f11572a = gn7Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BetSystemRequest", gn7Var, 4);
        zna0Var.j("b", false);
        zna0Var.j("c", false);
        zna0Var.j("p", false);
        zna0Var.j("s", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a)};
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
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new kn7(i, num, num2, num3, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kn7 kn7Var = (kn7) obj;
        kn7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        okx okxVar = okx.f25427a;
        cldVarA.p(ugi0Var, 0, okxVar, kn7Var.f18569a);
        cldVarA.p(ugi0Var, 1, okxVar, kn7Var.b);
        cldVarA.p(ugi0Var, 2, okxVar, kn7Var.c);
        cldVarA.p(ugi0Var, 3, tbl.f33669a, kn7Var.d);
        cldVarA.c(ugi0Var);
    }
}
