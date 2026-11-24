package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pxt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27771a;
    public final /* synthetic */ sxt0 b;

    public /* synthetic */ pxt0(sxt0 sxt0Var, byte b) {
        this.f27771a = b;
        this.b = sxt0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27771a;
        sxt0 sxt0Var = this.b;
        switch (b) {
            case 0:
                a0u0 a0u0Var = (a0u0) obj;
                svs0 svs0Var = sxt0.b2;
                a0u0Var.getClass();
                byte b2 = 1;
                if (a0u0Var instanceof xzt0) {
                    wus wusVar = ((xzt0) a0u0Var).f41771a;
                    xi70 xi70Var = sxt0Var.R1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = sxt0Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(sxt0Var, wusVar, xi70Var, wdk0Var, new pxt0(sxt0Var, b2));
                } else if (a0u0Var instanceof yzt0) {
                    String str = ((yzt0) a0u0Var).f43532a;
                    wdk0 wdk0Var2 = sxt0Var.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    xdk0 xdk0Var = new xdk0(rek0.b, str, null, null, null, null, 124);
                    Object objN = sxt0Var.Y1.n(sxt0.c2[0], sxt0Var);
                    objN.getClass();
                    wdk0.j(wdk0Var2, xdk0Var, sxt0Var.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                } else {
                    byte b3 = 2;
                    if (a0u0Var instanceof zzt0) {
                        if (sxt0Var.Q1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = sxt0Var.C();
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
                        if (!(a0u0Var instanceof wzt0)) {
                            t9f.b();
                            return null;
                        }
                        xa30 xa30Var = ((wzt0) a0u0Var).f40035a;
                        wdk0 wdk0Var3 = sxt0Var.P1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        cww.v(sxt0Var, xa30Var, wdk0Var3, new pxt0(sxt0Var, b3));
                    }
                }
                sxt0Var.H0().x(uwt0.f36409a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                svs0 svs0Var2 = sxt0.b2;
                nusVar.getClass();
                sxt0Var.H0().x(new kxt0(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                svs0 svs0Var3 = sxt0.b2;
                imsVar.getClass();
                sxt0Var.H0().x(new axt0(imsVar));
                return Unit.f46060a;
        }
    }
}
