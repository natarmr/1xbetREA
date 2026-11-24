package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hj30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hj30 f13142a;
    private static final ugi0 descriptor;

    static {
        hj30 hj30Var = new hj30();
        f13142a = hj30Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.feed.MbCyberGroupBySportResponse", hj30Var, 3);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("games", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jj30.d;
        j26 j26Var = j26.f15767a;
        return new jiy[]{mrv.j0(j26Var), mrv.j0(j26Var), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jj30.d;
        boolean z = true;
        int i = 0;
        l26 l26Var = null;
        l26 l26Var2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l26Var = (l26) bldVarA.e(ugi0Var, 0, j26.f15767a, l26Var);
                i |= 1;
            } else if (iF == 1) {
                l26Var2 = (l26) bldVarA.e(ugi0Var, 1, j26.f15767a, l26Var2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new jj30(i, l26Var, l26Var2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jj30 jj30Var = (jj30) obj;
        jj30Var.getClass();
        List list = jj30Var.c;
        l26 l26Var = jj30Var.b;
        l26 l26Var2 = jj30Var.f16603a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jj30.d;
        if (cldVarA.u(ugi0Var) || l26Var2 != null) {
            cldVarA.p(ugi0Var, 0, j26.f15767a, l26Var2);
        }
        if (cldVarA.u(ugi0Var) || l26Var != null) {
            cldVarA.p(ugi0Var, 1, j26.f15767a, l26Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
