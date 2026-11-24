package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sju extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xqt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sju(xqt xqtVar, zje zjeVar) {
        super(zjeVar);
        this.j = xqtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
