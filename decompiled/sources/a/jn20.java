package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jn20 extends zje {
    public Iterator i;
    public hf6 j;
    public double k;
    public double l;
    public double m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ on20 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.p = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.U0(null, this);
    }
}
