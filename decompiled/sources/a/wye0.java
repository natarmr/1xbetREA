package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wye0 extends zje {
    public elt i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ eze0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wye0(eze0 eze0Var, zje zjeVar) {
        super(zjeVar);
        this.l = eze0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.X(this);
    }
}
