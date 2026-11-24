package a;

/* JADX INFO: loaded from: classes6.dex */
public final class som extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tom j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public som(tom tomVar, zje zjeVar) {
        super(zjeVar);
        this.j = tomVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i1(this);
    }
}
