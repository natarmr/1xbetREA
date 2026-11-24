package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ihn0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pzu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihn0(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.j = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g0(false, this);
    }
}
