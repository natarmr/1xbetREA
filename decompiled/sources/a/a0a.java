package a;

/* JADX INFO: loaded from: classes.dex */
public final class a0a extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b0a j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0a(b0a b0aVar, zje zjeVar) {
        super(zjeVar);
        this.j = b0aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
