package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class a97 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ f97 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a97(f97 f97Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = f97Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new a97(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a97) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ql5 ql5Var;
        txs0 txs0Var;
        long j;
        BetHistoryScreenModel betHistoryScreenModel;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        f97 f97Var = this.j;
        if (!z) {
            z1x.P(obj);
            ql5Var = ((i77) f97Var.D()).e;
            if (ql5Var == null) {
                this.i = true;
                obj = f97Var.S(this);
                if (obj == wneVar) {
                    return wneVar;
                }
            }
            i3t0.A(f97Var, f97Var.D, n1k.f22753a, null, null, 6);
            txs0Var = ql5Var.i;
            j = ql5Var.f28916a;
            if (txs0Var.a()) {
                f97Var.G(k67.f17754a);
            } else {
                betHistoryScreenModel = f97Var.p;
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                    i3t0.A(f97Var, f97Var.C, new q0k(BetHistoryScreenModel.BetHistory.a((BetHistoryScreenModel.BetHistory) betHistoryScreenModel, j, null, 14)), null, null, 6);
                } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    i3t0.A(f97Var, f97Var.C, new q0k(BetHistoryScreenModel.BetChampHistory.a((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel, j, null, 62)), null, null, 6);
                }
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        ql5Var = (ql5) obj;
        i3t0.A(f97Var, f97Var.D, n1k.f22753a, null, null, 6);
        txs0Var = ql5Var.i;
        j = ql5Var.f28916a;
        if (txs0Var.a()) {
            f97Var.G(k67.f17754a);
        } else {
            betHistoryScreenModel = f97Var.p;
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                i3t0.A(f97Var, f97Var.C, new q0k(BetHistoryScreenModel.BetHistory.a((BetHistoryScreenModel.BetHistory) betHistoryScreenModel, j, null, 14)), null, null, 6);
            } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                i3t0.A(f97Var, f97Var.C, new q0k(BetHistoryScreenModel.BetChampHistory.a((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel, j, null, 62)), null, null, 6);
            }
        }
        return Unit.f46060a;
    }
}
