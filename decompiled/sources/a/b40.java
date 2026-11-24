package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b40 f1933a;
    private static final ugi0 descriptor;

    static {
        b40 b40Var = new b40();
        f1933a = b40Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.AdvanceRequest", b40Var, 3);
        zna0Var.j("Events", true);
        zna0Var.j("UserIdBonus", true);
        zna0Var.j("UserId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) d40.d[0].getValue());
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = d40.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new d40(i, l, l2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d40 d40Var = (d40) obj;
        d40Var.getClass();
        Long l = d40Var.c;
        Long l2 = d40Var.b;
        List list = d40Var.f5429a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = d40.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
