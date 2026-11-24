package a;

/* JADX INFO: loaded from: classes.dex */
public final class c39 extends zje {
    public jge0 i;
    public Object[] j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d39 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c39(d39 d39Var, zje zjeVar) {
        super(zjeVar);
        this.n = d39Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
