package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ovp0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cyu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovp0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.j = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r(this);
    }
}
