package a;

/* JADX INFO: loaded from: classes.dex */
public final class w8a extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g9a j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.j = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(0, this);
    }
}
