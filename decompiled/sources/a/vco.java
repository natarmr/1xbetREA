package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vco extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wco j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vco(wco wcoVar, zje zjeVar) {
        super(zjeVar);
        this.j = wcoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
