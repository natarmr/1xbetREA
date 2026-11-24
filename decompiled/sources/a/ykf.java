package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ykf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42785a;
    public final /* synthetic */ alf b;

    public /* synthetic */ ykf(alf alfVar, byte b) {
        this.f42785a = b;
        this.b = alfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42785a;
        alf alfVar = this.b;
        switch (b) {
            case 0:
                vmf vmfVar = (vmf) obj;
                kud kudVar = alf.a2;
                vmfVar.getClass();
                byte b2 = 1;
                if (vmfVar instanceof smf) {
                    wus wusVar = ((smf) vmfVar).f32442a;
                    xi70 xi70Var = alfVar.Q1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = alfVar.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(alfVar, wusVar, xi70Var, wdk0Var, new ykf(alfVar, b2));
                } else if (vmfVar instanceof tmf) {
                    String str = ((tmf) vmfVar).f34191a;
                    wdk0 wdk0Var2 = alfVar.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    xdk0 xdk0Var = new xdk0(rek0.b, str, null, null, null, null, 124);
                    Object objN = alfVar.W1.n(alf.b2[1], alfVar);
                    objN.getClass();
                    wdk0.j(wdk0Var2, xdk0Var, alfVar.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                } else {
                    byte b3 = 2;
                    if (vmfVar instanceof umf) {
                        if (alfVar.R1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = alfVar.C();
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
                        if (!(vmfVar instanceof rmf)) {
                            t9f.b();
                            return null;
                        }
                        xa30 xa30Var = ((rmf) vmfVar).f30741a;
                        wdk0 wdk0Var3 = alfVar.M1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        cww.v(alfVar, xa30Var, wdk0Var3, new ykf(alfVar, b3));
                    }
                }
                alfVar.H0().x(xjf.f40981a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                kud kudVar2 = alf.a2;
                nusVar.getClass();
                alfVar.H0().x(new mkf(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                kud kudVar3 = alf.a2;
                imsVar.getClass();
                alfVar.H0().x(new dkf(imsVar));
                return Unit.f46060a;
        }
    }
}
