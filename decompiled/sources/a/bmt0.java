package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bmt0 extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cmt0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmt0(cmt0 cmt0Var, zje zjeVar) {
        super(zjeVar);
        this.k = cmt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(0.0d, this);
    }
}
