package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ia extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ab j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ab abVar, zje zjeVar) {
        super(zjeVar);
        this.j = abVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
