package a;

/* JADX INFO: loaded from: classes5.dex */
public final class c4c extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d4c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4c(d4c d4cVar, zje zjeVar) {
        super(zjeVar);
        this.j = d4cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this, null);
    }
}
