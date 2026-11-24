package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gk8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gk8 f11433a;
    private static final ugi0 descriptor;

    static {
        gk8 gk8Var = new gk8();
        f11433a = gk8Var;
        zna0 zna0Var = new zna0("org.xplatform.bonuses.impl.data.models.BonusesResponse", gk8Var, 10);
        zna0Var.j("Id", true);
        zna0Var.j("BonusName", true);
        zna0Var.j("BonusType", true);
        zna0Var.j("BonusStart", true);
        zna0Var.j("BonusFact", true);
        zna0Var.j("BonusFinish", true);
        zna0Var.j("Money", true);
        zna0Var.j("ClosingTime", true);
        zna0Var.j("CurIso", true);
        zna0Var.j("BonusClosed", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i |= 32;
                    break;
                case 6:
                    d4 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d4);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new ik8(i, num2, str2, num3, d, d2, d3, d4, l, str, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ik8 ik8Var = (ik8) obj;
        ik8Var.getClass();
        Integer num = ik8Var.j;
        String str = ik8Var.i;
        Long l = ik8Var.h;
        Double d = ik8Var.g;
        Double d2 = ik8Var.f;
        Double d3 = ik8Var.e;
        Double d4 = ik8Var.d;
        Integer num2 = ik8Var.c;
        String str2 = ik8Var.b;
        Integer num3 = ik8Var.f14912a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
