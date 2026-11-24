package a;

/* JADX INFO: loaded from: classes4.dex */
public final class i3c extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ j3c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3c(j3c j3cVar, zje zjeVar) {
        super(zjeVar);
        this.j = j3cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, this);
    }
}
