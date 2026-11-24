package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class el5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fl5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el5(fl5 fl5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fl5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fl5 fl5Var = this.k;
        switch (b) {
            case 0:
                el5 el5Var = new el5(fl5Var, yjeVar, (byte) 0);
                el5Var.j = obj;
                return el5Var;
            default:
                el5 el5Var2 = new el5(fl5Var, yjeVar, (byte) 1);
                el5Var2.j = obj;
                return el5Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((el5) create((jj5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((el5) create((pi5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                jj5 jj5Var = (jj5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (jj5Var instanceof hj5) {
                    j120.c0(this.k.o0(), "open/paymentconsultant");
                }
                return Unit.f46060a;
            default:
                pi5 pi5Var = (pi5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (pi5Var instanceof oi5) {
                    fl5 fl5Var = this.k;
                    wdk0 wdk0Var = fl5Var.L1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((oi5) pi5Var).f25295a, null, null, null, null, 124), fl5Var, null, null, false, null, 1020);
                    ((dk5) fl5Var.N1.getValue()).G();
                }
                return Unit.f46060a;
        }
    }
}
