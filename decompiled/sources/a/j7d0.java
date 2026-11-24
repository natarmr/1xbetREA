package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j7d0 extends zje {
    public String i;
    public jnf0 j;
    public Iterator k;
    public rl l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k7d0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7d0(k7d0 k7d0Var, zje zjeVar) {
        super(zjeVar);
        this.n = k7d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.i(null, null, this);
    }
}
