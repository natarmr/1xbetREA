package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xk00 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zpu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk00(zpu zpuVar, zje zjeVar) {
        super(zjeVar);
        this.j = zpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(this);
    }
}
