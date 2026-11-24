package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yh40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42620a;
    public final /* synthetic */ ai40 b;

    public /* synthetic */ yh40(ai40 ai40Var, byte b) {
        this.f42620a = b;
        this.b = ai40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42620a;
        ai40 ai40Var = this.b;
        switch (b) {
            case 0:
                bl40 bl40Var = (bl40) obj;
                atz atzVar = ai40.b2;
                bl40Var.getClass();
                byte b2 = 1;
                if (bl40Var instanceof zk40) {
                    wus wusVar = ((zk40) bl40Var).f44511a;
                    xi70 xi70Var = ai40Var.R1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = ai40Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(ai40Var, wusVar, xi70Var, wdk0Var, new yh40(ai40Var, b2));
                } else {
                    byte b3 = 2;
                    if (bl40Var instanceof yk40) {
                        xa30 xa30Var = ((yk40) bl40Var).f42771a;
                        wdk0 wdk0Var2 = ai40Var.P1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        cww.v(ai40Var, xa30Var, wdk0Var2, new yh40(ai40Var, b3));
                    } else {
                        if (!(bl40Var instanceof al40)) {
                            t9f.b();
                            return null;
                        }
                        if (ai40Var.Q1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = ai40Var.C();
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
                    }
                }
                ai40Var.H0().x(ih40.f14764a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                atz atzVar2 = ai40.b2;
                nusVar.getClass();
                ai40Var.H0().x(new th40(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                atz atzVar3 = ai40.b2;
                imsVar.getClass();
                ai40Var.H0().x(new lh40(imsVar));
                return Unit.f46060a;
        }
    }
}
