package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ol20 extends zje {
    public q4f i;
    public vtb0 j;
    public ql5 k;
    public List l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ on20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.o = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.x0(null, null, this);
    }
}
