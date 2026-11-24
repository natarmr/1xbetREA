package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class st10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final st10 f32753a;
    private static final ugi0 descriptor;

    static {
        st10 st10Var = new st10();
        f32753a = st10Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.MainFeedChampsByCountryResponse", st10Var, 4);
        zna0Var.j("countries", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("sport", true);
        zna0Var.j("tabs", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = du10.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(s710.f31729a), mrv.j0(au10.f1457a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = du10.e;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        cu10 cu10Var = null;
        List list2 = null;
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
            } else if (iF == 2) {
                cu10Var = (cu10) bldVarA.e(ugi0Var, 2, au10.f1457a, cu10Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new du10(i, list, l, cu10Var, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        du10 du10Var = (du10) obj;
        du10Var.getClass();
        List list = du10Var.d;
        cu10 cu10Var = du10Var.c;
        Long l = du10Var.b;
        List list2 = du10Var.f6680a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = du10.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || cu10Var != null) {
            cldVarA.p(ugi0Var, 2, au10.f1457a, cu10Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
