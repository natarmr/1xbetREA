package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pg20 extends zje {
    public Iterator i;
    public int j;
    public int k;
    public double l;
    public double m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qg20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.o = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.o0(this);
    }
}
