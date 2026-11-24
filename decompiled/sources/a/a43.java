package a;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edu f203a = edu.q("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final edu b = edu.q("k");

    public static void a(v33 v33Var, fa10 fa10Var) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) v33Var.b;
        if (list.isEmpty()) {
            list.add(new cmy(fa10Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fa10Var.m)));
        } else if (((cmy) list.get(0)).b == null) {
            list.set(0, new cmy(fa10Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fa10Var.m)));
        }
    }

    public static boolean b(v33 v33Var) {
        if (v33Var != null) {
            return v33Var.g() && ((Float) ((cmy) ((List) v33Var.b).get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    public static z33 c(udy udyVar, fa10 fa10Var) throws l52, EOFException {
        u33 u33Var;
        boolean z = udyVar.w() == 3;
        if (z) {
            udyVar.c();
        }
        ok50 ok50VarA = null;
        b43 b43VarB = null;
        v33 v33VarP = null;
        u33 u33Var2 = null;
        v33 v33VarP2 = null;
        v33 v33VarP3 = null;
        v33 v33VarP4 = null;
        v33 v33VarP5 = null;
        v33 v33VarP6 = null;
        u33 u33VarR = null;
        v33 v33VarP7 = null;
        v33 v33VarP8 = null;
        while (udyVar.l()) {
            switch (udyVar.y(f203a)) {
                case 0:
                    udyVar.c();
                    while (udyVar.l()) {
                        if (udyVar.y(b) != 0) {
                            udyVar.F();
                            udyVar.H();
                        } else {
                            ok50VarA = w33.a(udyVar, fa10Var);
                        }
                    }
                    udyVar.e();
                    break;
                case 1:
                    b43VarB = w33.b(udyVar, fa10Var);
                    break;
                case 2:
                    u33Var2 = new u33(gmy.a(udyVar, fa10Var, 1.0f, lwf.z, false), (byte) 4);
                    break;
                case 3:
                    v33VarP6 = ju70.P(udyVar, fa10Var, false);
                    a(v33VarP6, fa10Var);
                    break;
                case 4:
                    v33VarP = ju70.P(udyVar, fa10Var, false);
                    a(v33VarP, fa10Var);
                    break;
                case 5:
                    u33VarR = ju70.R(udyVar, fa10Var);
                    break;
                case 6:
                    v33VarP7 = ju70.P(udyVar, fa10Var, false);
                    break;
                case 7:
                    v33VarP8 = ju70.P(udyVar, fa10Var, false);
                    break;
                case 8:
                    v33VarP2 = ju70.P(udyVar, fa10Var, false);
                    break;
                case 9:
                    v33VarP3 = ju70.P(udyVar, fa10Var, false);
                    break;
                case 10:
                    v33VarP4 = ju70.P(udyVar, fa10Var, false);
                    a(v33VarP4, fa10Var);
                    break;
                case 11:
                    v33VarP5 = ju70.P(udyVar, fa10Var, false);
                    a(v33VarP5, fa10Var);
                    break;
                default:
                    udyVar.F();
                    udyVar.H();
                    break;
            }
        }
        if (z) {
            udyVar.e();
        }
        if (ok50VarA == null || (ok50VarA.g() && ((PointF) ((cmy) ((ArrayList) ok50VarA.f25390a).get(0)).b).equals(0.0f, 0.0f))) {
            ok50VarA = null;
        }
        b43 b43Var = (b43VarB == null || (!(b43VarB instanceof x33) && b43VarB.g() && ((PointF) ((cmy) b43VarB.j0().get(0)).b).equals(0.0f, 0.0f))) ? null : b43VarB;
        v33 v33Var = b(v33VarP) ? null : v33VarP;
        if (u33Var2 == null) {
            u33Var = null;
        } else {
            if (u33Var2.g()) {
                m1h0 m1h0Var = (m1h0) ((cmy) ((List) u33Var2.b).get(0)).b;
                if (m1h0Var.f21008a == 1.0f && m1h0Var.b == 1.0f) {
                    u33Var = null;
                }
            }
            u33Var = u33Var2;
        }
        return new z33(ok50VarA, b43Var, u33Var, v33Var, u33VarR, v33VarP7, v33VarP8, (v33VarP2 == null || (v33VarP2.g() && ((Float) ((cmy) ((List) v33VarP2.b).get(0)).b).floatValue() == 0.0f)) ? null : v33VarP2, (v33VarP3 == null || (v33VarP3.g() && ((Float) ((cmy) ((List) v33VarP3.b).get(0)).b).floatValue() == 0.0f)) ? null : v33VarP3, b(v33VarP4) ? null : v33VarP4, b(v33VarP5) ? null : v33VarP5, b(v33VarP6) ? null : v33VarP6);
    }
}
