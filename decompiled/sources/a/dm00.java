package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dm00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dm00 f6303a;
    private static final ugi0 descriptor;

    static {
        dm00 dm00Var = new dm00();
        f6303a = dm00Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.load_coupon.data.model.LoadCouponResponse", dm00Var, 10);
        zna0Var.j("avanceBet", true);
        zna0Var.j("maxBet", true);
        zna0Var.j("expressNum", true);
        zna0Var.j("AntiExpressCoef", true);
        zna0Var.j("Vid", true);
        zna0Var.j("HasRemoveEvents", true);
        zna0Var.j("WithLobby", true);
        zna0Var.j("Events", true);
        zna0Var.j("EventsIndexes", true);
        zna0Var.j("MinBetSystems", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = fm00.k;
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ0 = mrv.j0(sm8Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(s710.f31729a), mrv.j0(tblVar), mrv.j0(okx.f25427a), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = fm00.k;
        List list = null;
        List list2 = null;
        boolean z = true;
        List list3 = null;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Long l = null;
        Double d2 = null;
        Integer num = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool2);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool3);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new fm00(i, bool, d, l, d2, num, bool2, bool3, list3, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fm00 fm00Var = (fm00) obj;
        fm00Var.getClass();
        List list = fm00Var.j;
        List list2 = fm00Var.i;
        List list3 = fm00Var.h;
        Boolean bool = fm00Var.g;
        Boolean bool2 = fm00Var.f;
        Integer num = fm00Var.e;
        Double d = fm00Var.d;
        Long l = fm00Var.c;
        Double d2 = fm00Var.b;
        Boolean bool3 = fm00Var.f9763a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fm00.k;
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
