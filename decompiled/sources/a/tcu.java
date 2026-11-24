package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tcu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ucu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcu(ucu ucuVar, zje zjeVar) {
        super(zjeVar);
        this.j = ucuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}
