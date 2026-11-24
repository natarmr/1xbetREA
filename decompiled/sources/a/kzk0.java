package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kzk0 extends zje {
    public boolean i;
    public ql5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n660 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzk0(n660 n660Var, zje zjeVar) {
        super(zjeVar);
        this.l = n660Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(false, this);
    }
}
