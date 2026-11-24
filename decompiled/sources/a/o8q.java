package a;

import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o8q extends zje {
    public double i;
    public boolean j;
    public ql5 k;
    public FinInstrumentUIModel l;
    public yh7 m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ r8q p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8q(r8q r8qVar, zje zjeVar) {
        super(zjeVar);
        this.p = r8qVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.C(0.0d, this, false);
    }
}
