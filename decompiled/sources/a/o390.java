package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o390 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o390 f24572a;
    private static final ugi0 descriptor;

    static {
        o390 o390Var = new o390();
        f24572a = o390Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.core.data.models.PayRotationResponse", o390Var, 5);
        zna0Var.j("UI", true);
        zna0Var.j("PT", true);
        zna0Var.j("RT", true);
        zna0Var.j("BAC", true);
        zna0Var.j("BL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Long l2 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else if (iF == 3) {
                l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new q390(i, l, num, num2, l2, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q390 q390Var = (q390) obj;
        q390Var.getClass();
        Double d = q390Var.e;
        Long l = q390Var.d;
        Integer num = q390Var.c;
        Integer num2 = q390Var.b;
        Long l2 = q390Var.f28041a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
