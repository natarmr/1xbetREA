package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qtu extends zje {
    public boolean i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rtu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtu(rtu rtuVar, yje yjeVar) {
        super(yjeVar);
        this.l = rtuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(false, 0, this);
    }
}
