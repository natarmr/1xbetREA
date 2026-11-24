package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n5x implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n5x f22966a;
    private static final ugi0 descriptor;

    static {
        n5x n5xVar = new n5x();
        f22966a = n5xVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.indian_poker.IndianPokerResponse", n5xVar, 5);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("Combination1", true);
        zna0Var.j("Combination2", true);
        zna0Var.j("STATE", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = p5x.f;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(j5x.f15955a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = p5x.f;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        i5x i5xVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                i5xVar = (i5x) bldVarA.e(ugi0Var, 4, j5x.f15955a, i5xVar);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new p5x(i, list, list2, str, str2, i5xVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p5x p5xVar = (p5x) obj;
        p5xVar.getClass();
        i5x i5xVar = p5xVar.e;
        String str = p5xVar.d;
        String str2 = p5xVar.c;
        List list = p5xVar.b;
        List list2 = p5xVar.f26425a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = p5x.f;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || i5xVar != null) {
            cldVarA.p(ugi0Var, 4, j5x.f15955a, i5xVar);
        }
        cldVarA.c(ugi0Var);
    }
}
