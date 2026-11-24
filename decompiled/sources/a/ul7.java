package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ul7 extends bnn0 implements Function2 {
    public fm7 i;
    public htt j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fm7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul7(fm7 fm7Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = fm7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ul7 ul7Var = new ul7(this.m, yjeVar);
        ul7Var.l = obj;
        return ul7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ul7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        htt httVar;
        fm7 fm7Var;
        BetHistoryScreenModel betHistoryScreenModel;
        BetHistoryScreenModel.BetChampHistory betChampHistory;
        String str;
        ek80 ek80Var;
        p7m0 p7m0Var;
        fm7 fm7Var2 = this.m;
        mne mneVar = fm7Var2.p;
        vne vneVar = (vne) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        yje yjeVar = null;
        if (b == 0) {
            z1x.P(obj);
            this.l = vneVar;
            this.k = (byte) 1;
            int i = fm7.p0;
            if (fm7Var2.P(this) != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            htt httVar2 = this.j;
            fm7Var = this.i;
            z1x.P(obj);
            httVar = httVar2;
        }
        long j = ((ql5) obj).f28916a;
        long j2 = ((jk7) fm7Var2.D()).c;
        betHistoryScreenModel = fm7Var2.o;
        if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
            betChampHistory = (BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel;
        } else {
            betChampHistory = null;
        }
        if (betChampHistory != null) {
            str = betChampHistory.f;
        } else {
            str = null;
        }
        fm7Var.j0 = new ek80(httVar.a(j, j2, str), jiu0.a(fm7Var2), mneVar.b);
        ek80Var = fm7Var2.j0;
        if (ek80Var != null && (p7m0Var = ek80Var.e) != null) {
            sac.T(new fnq(p7m0Var, new xw5(fm7Var2, yjeVar, (byte) 20), (byte) 4), d5c.S(vneVar, mneVar.f22085a), foe.h);
        }
        return Unit.f46060a;
        htt httVar3 = fm7Var2.r;
        this.l = vneVar;
        this.i = fm7Var2;
        this.j = httVar3;
        this.k = (byte) 2;
        Serializable serializableN = fm7Var2.N(this);
        if (serializableN != wneVar) {
            httVar = httVar3;
            obj = serializableN;
            fm7Var = fm7Var2;
            long j3 = ((ql5) obj).f28916a;
            long j4 = ((jk7) fm7Var2.D()).c;
            betHistoryScreenModel = fm7Var2.o;
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                betChampHistory = (BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel;
            } else {
                betChampHistory = null;
            }
            if (betChampHistory != null) {
                str = betChampHistory.f;
            } else {
                str = null;
            }
            fm7Var.j0 = new ek80(httVar.a(j3, j4, str), jiu0.a(fm7Var2), mneVar.b);
            ek80Var = fm7Var2.j0;
            if (ek80Var != null) {
                sac.T(new fnq(p7m0Var, new xw5(fm7Var2, yjeVar, (byte) 20), (byte) 4), d5c.S(vneVar, mneVar.f22085a), foe.h);
            }
            return Unit.f46060a;
        }
        return wneVar;
    }
}
