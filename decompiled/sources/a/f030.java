package a;

/* JADX INFO: loaded from: classes6.dex */
public final class f030 extends zje {
    public ctc i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o030 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f030(o030 o030Var, zje zjeVar) {
        super(zjeVar);
        this.k = o030Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, null, false, null, null, this);
    }
}
