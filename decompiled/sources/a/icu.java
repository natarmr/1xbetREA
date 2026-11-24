package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class icu extends bnn0 implements Function2 {
    public mie0 i;
    public mie0 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cmt m;
    public final /* synthetic */ Set n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icu(cmt cmtVar, Set set, int i, long j, long j2, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.m = cmtVar;
        this.n = set;
        this.o = i;
        this.p = j;
        this.q = j2;
        this.r = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        icu icuVar = new icu(this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
        icuVar.l = obj;
        return icuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((icu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        mie0 mie0Var;
        mie0 mie0Var2;
        vne vneVar = (vne) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.k;
        if (!z) {
            mie0 mie0VarJ = ohs0.j(obj);
            mie0 mie0Var3 = new mie0();
            bby bbyVarW = sac.W(vneVar, true, "GetGameHistoryResultsUseCase", getContext(), new cx2(mie0Var3, (byte) 3), new hcu(mie0VarJ, this.m, this.n, this.o, this.p, this.q, this.r, null));
            this.l = null;
            this.i = mie0VarJ;
            this.j = mie0Var3;
            this.k = true;
            if (((pby) bbyVarW).join(this) == wneVar) {
                return wneVar;
            }
            mie0Var = mie0Var3;
            mie0Var2 = mie0VarJ;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = this.j;
            mie0Var2 = this.i;
            z1x.P(obj);
        }
        Throwable th = (Throwable) mie0Var.f21842a;
        if (th != null) {
            throw th;
        }
        List list = (List) mie0Var2.f21842a;
        return list == null ? iun.f15405a : list;
    }
}
