package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yju extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zju j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yju(zju zjuVar, zje zjeVar) {
        super(zjeVar);
        this.j = zjuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
