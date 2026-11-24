package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yg4 extends zje {
    public elt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fh4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg4(fh4 fh4Var, zje zjeVar) {
        super(zjeVar);
        this.k = fh4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O(this);
    }
}
