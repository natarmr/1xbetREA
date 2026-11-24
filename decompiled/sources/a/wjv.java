package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wjv extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yjv j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjv(yjv yjvVar, zje zjeVar) {
        super(zjeVar);
        this.j = yjvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(this);
    }
}
