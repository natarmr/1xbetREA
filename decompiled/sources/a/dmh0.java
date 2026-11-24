package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dmh0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ n660 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmh0(n660 n660Var, zje zjeVar) {
        super(zjeVar);
        this.j = n660Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.v(this);
    }
}
