package a;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class roq0 {
    public static void c(roq0 roq0Var, androidx.fragment.app.e eVar, int i) {
        roq0Var.getClass();
        eVar.getClass();
        noq0.m2.getClass();
        if (eVar.J("TipsDialogTag") == null) {
            noq0 noq0Var = new noq0();
            iiy[] iiyVarArr = noq0.n2;
            noq0Var.h2.I(noq0Var, iiyVarArr[3], i);
            noq0Var.i2.x(noq0Var, iiyVarArr[4], "");
            sj3.E0(noq0Var, eVar, "TipsDialogTag");
        }
    }

    public final void a(androidx.fragment.app.e eVar) {
        fk60 fk60Var;
        eVar.getClass();
        noq0.m2.getClass();
        Fragment fragmentJ = eVar.J("TipsDialogTag");
        if (eVar.J("TipsDialogTag") != null) {
            if (fragmentJ == null ? true : fragmentJ instanceof noq0) {
                noq0 noq0Var = (noq0) fragmentJ;
                if (noq0Var != null) {
                    xoq0 xoq0VarY0 = noq0Var.Y0();
                    if (!xoq0VarY0.K.m() && !xoq0VarY0.L.f() && (fk60Var = xoq0VarY0.j0) != null) {
                        xoq0VarY0.O.c(fk60Var, false);
                        xoq0VarY0.Q.D(fk60Var);
                    }
                }
                if (noq0Var != null) {
                    noq0Var.y0();
                }
            }
        }
    }

    public final boolean b(Fragment fragment) {
        fragment.getClass();
        return Intrinsics.d(fragment.B, "TipsDialogTag") || Intrinsics.d(fragment.B, "OnboardingBottomSheetContainerFragment");
    }

    public final void d(androidx.fragment.app.e eVar, int i, String str) {
        eVar.getClass();
        ki60.q2.getClass();
        if (eVar.J("OnboardingBottomSheetContainerFragment") == null) {
            ki60 ki60Var = new ki60();
            iiy[] iiyVarArr = ki60.r2;
            ki60Var.n2.I(ki60Var, iiyVarArr[1], i);
            ki60Var.o2.x(ki60Var, iiyVarArr[2], str);
            sj3.E0(ki60Var, eVar, "OnboardingBottomSheetContainerFragment");
        }
    }
}
