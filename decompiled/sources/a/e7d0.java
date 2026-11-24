package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e7d0 extends zje {
    public String i;
    public List j;
    public vne k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k7d0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7d0(k7d0 k7d0Var, zje zjeVar) {
        super(zjeVar);
        this.m = k7d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, null, null, this);
    }
}
