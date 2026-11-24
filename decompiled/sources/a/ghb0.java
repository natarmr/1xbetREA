package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ghb0 extends zje {
    public boolean i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ihb0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghb0(ihb0 ihb0Var, zje zjeVar) {
        super(zjeVar);
        this.l = ihb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
