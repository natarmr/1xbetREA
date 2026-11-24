package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edu f38480a = edu.q("k", "x", "y");

    public static ok50 a(udy udyVar, fa10 fa10Var) {
        ArrayList arrayList = new ArrayList();
        if (udyVar.w() == 1) {
            udyVar.a();
            while (udyVar.l()) {
                udy udyVar2 = udyVar;
                fa10 fa10Var2 = fa10Var;
                arrayList.add(new d290(fa10Var2, fmy.b(udyVar2, fa10Var2, cut0.c(), gqw0.y1, udyVar.w() == 3, false)));
                udyVar = udyVar2;
                fa10Var = fa10Var2;
            }
            udyVar.d();
            gmy.b(arrayList);
        } else {
            arrayList.add(new cmy(vdy.b(udyVar, cut0.c())));
        }
        return new ok50(arrayList);
    }

    public static b43 b(udy udyVar, fa10 fa10Var) {
        udyVar.c();
        ok50 ok50VarA = null;
        v33 v33VarP = null;
        boolean z = false;
        v33 v33VarP2 = null;
        while (udyVar.w() != 4) {
            int iY = udyVar.y(f38480a);
            if (iY == 0) {
                ok50VarA = a(udyVar, fa10Var);
            } else if (iY != 1) {
                if (iY != 2) {
                    udyVar.F();
                    udyVar.H();
                } else if (udyVar.w() == 6) {
                    udyVar.H();
                    z = true;
                } else {
                    v33VarP = ju70.P(udyVar, fa10Var, true);
                }
            } else if (udyVar.w() == 6) {
                udyVar.H();
                z = true;
            } else {
                v33VarP2 = ju70.P(udyVar, fa10Var, true);
            }
        }
        udyVar.e();
        if (z) {
            fa10Var.a("Lottie doesn't support expressions.");
        }
        return ok50VarA != null ? ok50VarA : new x33(v33VarP2, v33VarP);
    }
}
