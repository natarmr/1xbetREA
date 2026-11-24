package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kht implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kht f18307a;
    private static final ugi0 descriptor;

    static {
        kht khtVar = new kht();
        f18307a = khtVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.generate_coupon.data.model.GenerateCouponRequest", khtVar, 12);
        zna0Var.j("BetSize", false);
        zna0Var.j("CfView", false);
        zna0Var.j("CouponTypes", false);
        zna0Var.j("EventTypes", false);
        zna0Var.j("Sports", false);
        zna0Var.j("Lng", false);
        zna0Var.j("Partner", false);
        zna0Var.j("Payout", false);
        zna0Var.j("TimeFilter", false);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("Country", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mht.m;
        tbl tblVar = tbl.f33669a;
        okx okxVar = okx.f25427a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{tblVar, okxVar, a8zVarArr[2].getValue(), a8zVarArr[3].getValue(), a8zVarArr[4].getValue(), mrv.j0(ysm0.f43175a), okxVar, tblVar, okxVar, s710Var, s710Var, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mht.m;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        double dT = 0.0d;
        double dT2 = 0.0d;
        List list = null;
        List list2 = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        List list3 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    dT = bldVarA.t(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) bldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    iJ2 = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    dT2 = bldVarA.t(ugi0Var, 7);
                    i |= 128;
                    continue;
                case 8:
                    iJ3 = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    continue;
                case 9:
                    jR = bldVarA.r(ugi0Var, 9);
                    i |= 512;
                    continue;
                case 10:
                    jR2 = bldVarA.r(ugi0Var, 10);
                    i |= 1024;
                    continue;
                case 11:
                    iJ4 = bldVarA.j(ugi0Var, 11);
                    i |= 2048;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new mht(i, dT, iJ, list2, list, list3, str, iJ2, dT2, iJ3, jR, jR2, iJ4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mht mhtVar = (mht) obj;
        mhtVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mht.m;
        cldVarA.j(ugi0Var, 0, mhtVar.f21812a);
        cldVarA.i(1, mhtVar.b, ugi0Var);
        cldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), mhtVar.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), mhtVar.d);
        cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), mhtVar.e);
        cldVarA.p(ugi0Var, 5, ysm0.f43175a, mhtVar.f);
        cldVarA.i(6, mhtVar.g, ugi0Var);
        cldVarA.j(ugi0Var, 7, mhtVar.h);
        cldVarA.i(8, mhtVar.i, ugi0Var);
        cldVarA.n(ugi0Var, 9, mhtVar.j);
        cldVarA.n(ugi0Var, 10, mhtVar.k);
        cldVarA.i(11, mhtVar.l, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
