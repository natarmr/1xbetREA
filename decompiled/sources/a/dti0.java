package a;

/* JADX INFO: loaded from: classes.dex */
public final class dti0 extends zje {
    public long i;
    public long[] j;
    public /* synthetic */ Object k;
    public final /* synthetic */ eti0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dti0(eti0 eti0Var, zje zjeVar) {
        super(zjeVar);
        this.l = eti0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, null, this);
    }
}
