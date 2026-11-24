package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class bm7 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ fm7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm7(fm7 fm7Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = fm7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new bm7(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bm7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ql5 ql5Var;
        long j;
        f47 f47Var;
        BetHistoryScreenModel betHistoryScreenModel;
        BetHistoryScreenModel betHistoryScreenModelA;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        fm7 fm7Var = this.j;
        if (!z) {
            z1x.P(obj);
            ql5Var = ((jk7) fm7Var.D()).f;
            if (ql5Var == null) {
                this.i = true;
                obj = fm7Var.N(this);
                if (obj == wneVar) {
                    return wneVar;
                }
            }
            j = ql5Var.f28916a;
            f47Var = fm7Var.e0;
            betHistoryScreenModel = fm7Var.o;
            if (betHistoryScreenModel != null) {
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                    betHistoryScreenModelA = BetHistoryScreenModel.BetHistory.a((BetHistoryScreenModel.BetHistory) betHistoryScreenModel, j, null, 14);
                } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    betHistoryScreenModelA = BetHistoryScreenModel.BetChampHistory.a((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel, j, null, 62);
                }
                i3t0.A(fm7Var, f47Var, new q0k(betHistoryScreenModelA), null, null, 6);
                return Unit.f46060a;
            }
            t9f.b();
            return null;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        ql5Var = (ql5) obj;
        j = ql5Var.f28916a;
        f47Var = fm7Var.e0;
        betHistoryScreenModel = fm7Var.o;
        if (betHistoryScreenModel != null) {
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                betHistoryScreenModelA = BetHistoryScreenModel.BetHistory.a((BetHistoryScreenModel.BetHistory) betHistoryScreenModel, j, null, 14);
            } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                betHistoryScreenModelA = BetHistoryScreenModel.BetChampHistory.a((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel, j, null, 62);
            }
            i3t0.A(fm7Var, f47Var, new q0k(betHistoryScreenModelA), null, null, 6);
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }
}
