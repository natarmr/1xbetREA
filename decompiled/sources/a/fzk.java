package a;

/* JADX INFO: loaded from: classes.dex */
public final class fzk extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jzk j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzk(jzk jzkVar, zje zjeVar) {
        super(zjeVar);
        this.j = jzkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, null, this);
    }
}
