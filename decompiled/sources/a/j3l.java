package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j3l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15839a;
    public final /* synthetic */ l3l b;

    public /* synthetic */ j3l(l3l l3lVar, byte b) {
        this.f15839a = b;
        this.b = l3lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15839a;
        l3l l3lVar = this.b;
        switch (b) {
            case 0:
                e7l e7lVar = (e7l) obj;
                nek nekVar = l3l.b2;
                e7lVar.getClass();
                byte b2 = 1;
                if (e7lVar instanceof b7l) {
                    wus wusVar = ((b7l) e7lVar).f2115a;
                    xi70 xi70Var = l3lVar.R1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = l3lVar.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(l3lVar, wusVar, xi70Var, wdk0Var, new j3l(l3lVar, b2));
                } else if (e7lVar instanceof c7l) {
                    String str = ((c7l) e7lVar).f3869a;
                    wdk0 wdk0Var2 = l3lVar.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    xdk0 xdk0Var = new xdk0(rek0.b, str, null, null, null, null, 124);
                    Object objN = l3lVar.Y1.n(l3l.c2[0], l3lVar);
                    objN.getClass();
                    wdk0.j(wdk0Var2, xdk0Var, l3lVar.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                } else {
                    byte b3 = 2;
                    if (e7lVar instanceof d7l) {
                        if (l3lVar.Q1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = l3lVar.C();
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
                        if (!(e7lVar instanceof a7l)) {
                            t9f.b();
                            return null;
                        }
                        xa30 xa30Var = ((a7l) e7lVar).f376a;
                        wdk0 wdk0Var3 = l3lVar.P1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        cww.v(l3lVar, xa30Var, wdk0Var3, new j3l(l3lVar, b3));
                    }
                }
                l3lVar.H0().x(f1l.f8769a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                nek nekVar2 = l3l.b2;
                nusVar.getClass();
                l3lVar.H0().x(new w1l(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                nek nekVar3 = l3l.b2;
                imsVar.getClass();
                l3lVar.H0().x(new m1l(imsVar));
                return Unit.f46060a;
        }
    }
}
