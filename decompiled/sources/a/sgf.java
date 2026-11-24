package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sgf extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tgf j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgf(tgf tgfVar, zje zjeVar) {
        super(zjeVar);
        this.j = tgfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0.0d, 0L, this, null, null);
    }
}
