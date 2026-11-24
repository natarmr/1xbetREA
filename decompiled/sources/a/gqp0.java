package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gqp0 extends zje {
    public int i;
    public i050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ iqp0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqp0(iqp0 iqp0Var, zje zjeVar) {
        super(zjeVar);
        this.l = iqp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0, this);
    }
}
