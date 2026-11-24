package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mgb0 extends zje {
    public boolean i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j910 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgb0(j910 j910Var, zje zjeVar) {
        super(zjeVar);
        this.l = j910Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(false, this);
    }
}
