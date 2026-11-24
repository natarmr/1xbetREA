package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ow40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ow40 f25952a;
    private static final ugi0 descriptor;

    static {
        ow40 ow40Var = new ow40();
        f25952a = ow40Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.MultiSingleBetDataRequest", ow40Var, 9);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Date", false);
        zna0Var.j("Sign", false);
        zna0Var.j("Lng", false);
        zna0Var.j("Coupons", false);
        zna0Var.j("CouponCode", false);
        zna0Var.j("OneClickBet", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = qw40.j;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710Var, s710Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, a8zVarArr[6].getValue(), ysm0Var, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qw40.j;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        List list = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX3 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX4 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) bldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    strX5 = bldVarA.x(ugi0Var, 7);
                    i |= 128;
                    continue;
                case 8:
                    iJ = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new qw40(i, jR, jR2, strX, strX2, strX3, strX4, list, strX5, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qw40 qw40Var = (qw40) obj;
        qw40Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qw40.j;
        long j = qw40Var.f29418a;
        int i = qw40Var.i;
        cldVarA.n(ugi0Var, 0, j);
        cldVarA.n(ugi0Var, 1, qw40Var.b);
        cldVarA.z(ugi0Var, 2, qw40Var.c);
        cldVarA.z(ugi0Var, 3, qw40Var.d);
        cldVarA.z(ugi0Var, 4, qw40Var.e);
        cldVarA.z(ugi0Var, 5, qw40Var.f);
        cldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), qw40Var.g);
        cldVarA.z(ugi0Var, 7, qw40Var.h);
        if (cldVarA.u(ugi0Var) || i != 2) {
            cldVarA.i(8, i, ugi0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
