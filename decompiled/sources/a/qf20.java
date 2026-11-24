package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qf20 extends zje {
    public q4f i;
    public ql5 j;
    public ytb0 k;
    public List l;
    public double m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qg20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.o = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.Y(null, null, 0.0d, null, this);
    }
}
