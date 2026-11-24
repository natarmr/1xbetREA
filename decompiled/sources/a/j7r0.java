package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j7r0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7r0 f16055a;
    private static final ugi0 descriptor;

    static {
        j7r0 j7r0Var = new j7r0();
        f16055a = j7r0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.feed.data.model.TopGamesResponse", j7r0Var, 3);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("games", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = l7r0.d;
        j26 j26Var = j26.f15767a;
        return new jiy[]{mrv.j0(j26Var), mrv.j0(j26Var), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = l7r0.d;
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
        return new l7r0(i, l26Var, l26Var2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l7r0 l7r0Var = (l7r0) obj;
        l7r0Var.getClass();
        List list = l7r0Var.c;
        l26 l26Var = l7r0Var.b;
        l26 l26Var2 = l7r0Var.f19574a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = l7r0.d;
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
