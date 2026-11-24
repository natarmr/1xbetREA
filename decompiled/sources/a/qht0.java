package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qht0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qht0 f28757a;
    private static final ugi0 descriptor;

    static {
        qht0 qht0Var = new qht0();
        f28757a = qht0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.UpdateCouponBuilderRequest", qht0Var, 17);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Summ", false);
        zna0Var.j("CheckCf", false);
        zna0Var.j("notWait", false);
        zna0Var.j("avanceBet", false);
        zna0Var.j("AddPromoCodes", false);
        zna0Var.j("BuilderCoupon", false);
        zna0Var.j("Lng", false);
        zna0Var.j("IsNewBuilder", false);
        zna0Var.j("CfView", false);
        zna0Var.j("Kind", false);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("Source", false);
        zna0Var.j("partner", false);
        zna0Var.j("Country", false);
        zna0Var.j("Vid", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        sm8 sm8Var = sm8.f32432a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0Var, ysm0Var, okxVar, sm8Var, sm8Var, sm8Var, wb9.f38864a, ysm0Var, sm8Var, okxVar, okxVar, s710Var, s710Var, okxVar, okxVar, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i2 = 0;
        int iJ = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean zB4 = false;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        int iJ6 = 0;
        int iJ7 = 0;
        String strX = null;
        String strX2 = null;
        yb9 yb9Var = null;
        String strX3 = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strX2 = bldVarA.x(ugi0Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    iJ = bldVarA.j(ugi0Var, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    zB = bldVarA.B(ugi0Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    zB2 = bldVarA.B(ugi0Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    zB3 = bldVarA.B(ugi0Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    yb9Var = (yb9) bldVarA.m(ugi0Var, 6, wb9.f38864a, yb9Var);
                    i2 |= 64;
                    continue;
                case 7:
                    strX3 = bldVarA.x(ugi0Var, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    zB4 = bldVarA.B(ugi0Var, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    iJ2 = bldVarA.j(ugi0Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    iJ3 = bldVarA.j(ugi0Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    jR = bldVarA.r(ugi0Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    jR2 = bldVarA.r(ugi0Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    iJ4 = bldVarA.j(ugi0Var, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    iJ5 = bldVarA.j(ugi0Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    iJ6 = bldVarA.j(ugi0Var, 15);
                    i = 32768;
                    break;
                case 16:
                    iJ7 = bldVarA.j(ugi0Var, 16);
                    i = 65536;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            i2 |= i;
        }
        bldVarA.c(ugi0Var);
        return new sht0(i2, strX, strX2, iJ, zB, zB2, zB3, yb9Var, strX3, zB4, iJ2, iJ3, jR, jR2, iJ4, iJ5, iJ6, iJ7);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sht0 sht0Var = (sht0) obj;
        sht0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, sht0Var.f32231a);
        cldVarA.z(ugi0Var, 1, sht0Var.b);
        cldVarA.i(2, sht0Var.c, ugi0Var);
        cldVarA.x(ugi0Var, 3, sht0Var.d);
        cldVarA.x(ugi0Var, 4, sht0Var.e);
        cldVarA.x(ugi0Var, 5, sht0Var.f);
        cldVarA.m(ugi0Var, 6, wb9.f38864a, sht0Var.g);
        cldVarA.z(ugi0Var, 7, sht0Var.h);
        cldVarA.x(ugi0Var, 8, sht0Var.i);
        cldVarA.i(9, sht0Var.j, ugi0Var);
        cldVarA.i(10, sht0Var.k, ugi0Var);
        cldVarA.n(ugi0Var, 11, sht0Var.l);
        cldVarA.n(ugi0Var, 12, sht0Var.m);
        cldVarA.i(13, sht0Var.n, ugi0Var);
        cldVarA.i(14, sht0Var.o, ugi0Var);
        cldVarA.i(15, sht0Var.p, ugi0Var);
        cldVarA.i(16, sht0Var.q, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
