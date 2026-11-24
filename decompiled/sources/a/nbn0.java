package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nbn0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nvu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbn0(nvu nvuVar, zje zjeVar) {
        super(zjeVar);
        this.j = nvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(0L, this, false);
    }
}
