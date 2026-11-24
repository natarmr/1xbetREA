package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sud0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32814a;
    public final /* synthetic */ uud0 b;

    public /* synthetic */ sud0(uud0 uud0Var, byte b) {
        this.f32814a = b;
        this.b = uud0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32814a;
        uud0 uud0Var = this.b;
        switch (b) {
            case 0:
                nxd0 nxd0Var = (nxd0) obj;
                mi70 mi70Var = uud0.b2;
                nxd0Var.getClass();
                byte b2 = 1;
                if (nxd0Var instanceof kxd0) {
                    wus wusVar = ((kxd0) nxd0Var).f19049a;
                    xi70 xi70Var = uud0Var.R1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = uud0Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(uud0Var, wusVar, xi70Var, wdk0Var, new sud0(uud0Var, b2));
                } else if (nxd0Var instanceof lxd0) {
                    String str = ((lxd0) nxd0Var).f20810a;
                    wdk0 wdk0Var2 = uud0Var.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    xdk0 xdk0Var = new xdk0(rek0.b, str, null, null, null, null, 124);
                    Object objN = uud0Var.Y1.n(uud0.c2[0], uud0Var);
                    objN.getClass();
                    wdk0.j(wdk0Var2, xdk0Var, uud0Var.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                } else {
                    byte b3 = 2;
                    if (nxd0Var instanceof mxd0) {
                        if (uud0Var.Q1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = uud0Var.C();
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
                        if (!(nxd0Var instanceof jxd0)) {
                            t9f.b();
                            return null;
                        }
                        xa30 xa30Var = ((jxd0) nxd0Var).f17302a;
                        wdk0 wdk0Var3 = uud0Var.P1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        cww.v(uud0Var, xa30Var, wdk0Var3, new sud0(uud0Var, b3));
                    }
                }
                uud0Var.H0().x(vtd0.f38001a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                mi70 mi70Var2 = uud0.b2;
                nusVar.getClass();
                uud0Var.H0().x(new lud0(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                mi70 mi70Var3 = uud0.b2;
                imsVar.getClass();
                uud0Var.H0().x(new cud0(imsVar));
                return Unit.f46060a;
        }
    }
}
