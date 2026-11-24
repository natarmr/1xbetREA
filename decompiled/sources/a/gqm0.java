package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class gqm0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hqm0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqm0(hqm0 hqm0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hqm0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hqm0 hqm0Var = this.k;
        switch (b) {
            case 0:
                gqm0 gqm0Var = new gqm0(hqm0Var, yjeVar, (byte) 0);
                gqm0Var.j = obj;
                return gqm0Var;
            default:
                gqm0 gqm0Var2 = new gqm0(hqm0Var, yjeVar, (byte) 1);
                gqm0Var2.j = obj;
                return gqm0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gqm0) create((lqm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gqm0) create((nqm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hqm0 hqm0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                lqm0 lqm0Var = (lqm0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (lqm0Var != null) {
                    if (lqm0Var instanceof kqm0) {
                        s9m0 s9m0Var = hqm0.V1;
                        hqm0Var.G0().c.setVisibility(8);
                        hqm0Var.G0().e.b.setVisibility(0);
                        x0x.s(hqm0Var.G0().e.b);
                        epi0 epi0VarH0 = hqm0Var.H0();
                        iun iunVar = iun.f15405a;
                        iunVar.getClass();
                        bqm0 bqm0Var = (bqm0) epi0VarH0.b;
                        if (bqm0Var != null) {
                            bqm0Var.A(iunVar);
                        }
                    } else if (lqm0Var instanceof iqm0) {
                        s9m0 s9m0Var2 = hqm0.V1;
                        DSLottieEmptyContainer dSLottieEmptyContainer = hqm0Var.G0().c;
                        iqm0 iqm0Var = (iqm0) lqm0Var;
                        dSLottieEmptyContainer.b(iqm0Var.f15217a, iqm0Var.b, new lph0(0, hqm0Var.I0(), rqm0.class, "setEndTimerState", "setEndTimerState()V", 0, (byte) 27));
                        epi0 epi0VarH1 = hqm0Var.H0();
                        iun iunVar2 = iun.f15405a;
                        iunVar2.getClass();
                        bqm0 bqm0Var2 = (bqm0) epi0VarH1.b;
                        if (bqm0Var2 != null) {
                            bqm0Var2.A(iunVar2);
                        }
                        dSLottieEmptyContainer.setVisibility(0);
                        hqm0Var.G0().e.b.setVisibility(8);
                        x0x.O(hqm0Var.G0().e.b);
                        bqm0 bqm0Var3 = (bqm0) hqm0Var.H0().b;
                        if (bqm0Var3 != null) {
                            bqm0Var3.A(iunVar2);
                        }
                    } else if (lqm0Var instanceof jqm0) {
                        s9m0 s9m0Var3 = hqm0.V1;
                        hqm0Var.G0().c.setVisibility(8);
                        hqm0Var.G0().e.b.setVisibility(8);
                        x0x.O(hqm0Var.G0().e.b);
                        epi0 epi0VarH2 = hqm0Var.H0();
                        ArrayList arrayList = ((jqm0) lqm0Var).f16961a;
                        bqm0 bqm0Var4 = (bqm0) epi0VarH2.b;
                        if (bqm0Var4 != null) {
                            bqm0Var4.A(arrayList);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                nqm0 nqm0Var = (nqm0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (nqm0Var == null) {
                    t9f.b();
                    return null;
                }
                s9m0 s9m0Var4 = hqm0.V1;
                if (hqm0Var.N1 == null) {
                    Intrinsics.h("tipsDialogFeature");
                    throw null;
                }
                androidx.fragment.app.e eVarC = hqm0Var.C();
                eVarC.getClass();
                uuz uuzVar = fk60.b;
                ki60.q2.getClass();
                if (eVarC.J("OnboardingBottomSheetContainerFragment") == null) {
                    ki60 ki60Var = new ki60();
                    iiy[] iiyVarArr = ki60.r2;
                    ki60Var.n2.I(ki60Var, iiyVarArr[1], 24);
                    ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                    sj3.E0(ki60Var, eVarC, "OnboardingBottomSheetContainerFragment");
                }
                return Unit.f46060a;
        }
    }
}
