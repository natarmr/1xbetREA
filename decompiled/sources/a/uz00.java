package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uz00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36514a;
    public final /* synthetic */ wz00 b;

    public /* synthetic */ uz00(wz00 wz00Var, byte b) {
        this.f36514a = b;
        this.b = wz00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36514a;
        wz00 wz00Var = this.b;
        switch (b) {
            case 0:
                l310 l310Var = (l310) obj;
                wsz wszVar = wz00.b2;
                l310Var.getClass();
                byte b2 = 1;
                if (l310Var instanceof i310) {
                    wus wusVar = ((i310) l310Var).f14075a;
                    xi70 xi70Var = wz00Var.R1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = wz00Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(wz00Var, wusVar, xi70Var, wdk0Var, new uz00(wz00Var, b2));
                } else if (l310Var instanceof j310) {
                    String str = ((j310) l310Var).f15809a;
                    wdk0 wdk0Var2 = wz00Var.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    xdk0 xdk0Var = new xdk0(rek0.b, str, null, null, null, null, 124);
                    Object objN = wz00Var.Y1.n(wz00.c2[0], wz00Var);
                    objN.getClass();
                    wdk0.j(wdk0Var2, xdk0Var, wz00Var.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                } else {
                    byte b3 = 2;
                    if (l310Var instanceof k310) {
                        if (wz00Var.Q1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = wz00Var.C();
                        eVarC.getClass();
                        uuz uuzVar = fk60.b;
                        ki60.q2.getClass();
                        if (eVarC.J("OnboardingBottomSheetContainerFragment") == null) {
                            ki60 ki60Var = new ki60();
                            iiy[] iiyVarArr = ki60.r2;
                            ki60Var.n2.I(ki60Var, iiyVarArr[1], 21);
                            ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                            sj3.E0(ki60Var, eVarC, "OnboardingBottomSheetContainerFragment");
                        }
                    } else {
                        if (!(l310Var instanceof h310)) {
                            t9f.b();
                            return null;
                        }
                        xa30 xa30Var = ((h310) l310Var).f12364a;
                        wdk0 wdk0Var3 = wz00Var.P1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        cww.v(wz00Var, xa30Var, wdk0Var3, new uz00(wz00Var, b3));
                    }
                }
                wz00Var.H0().x(gy00.f12103a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                wsz wszVar2 = wz00.b2;
                nusVar.getClass();
                wz00Var.H0().x(new xy00(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                wsz wszVar3 = wz00.b2;
                imsVar.getClass();
                wz00Var.H0().x(new oy00(imsVar));
                return Unit.f46060a;
        }
    }
}
