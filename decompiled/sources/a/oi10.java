package a;

/* JADX INFO: loaded from: classes3.dex */
public final class oi10 extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public String m;
    public Object n;
    public qi10 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qi10 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi10(qi10 qi10Var, zje zjeVar) {
        super(zjeVar);
        this.q = qi10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(0, 0, this, null);
    }
}
