package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f370 extends zje {
    public boolean i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k370 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f370(k370 k370Var, zje zjeVar) {
        super(zjeVar);
        this.l = k370Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(false, this);
    }
}
