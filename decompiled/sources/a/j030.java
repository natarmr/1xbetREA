package a;

/* JADX INFO: loaded from: classes6.dex */
public final class j030 extends zje {
    public m97 i;
    public fht0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o030 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j030(o030 o030Var, zje zjeVar) {
        super(zjeVar);
        this.l = o030Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.t(null, this);
    }
}
