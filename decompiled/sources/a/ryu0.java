package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ryu0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ afm0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryu0(afm0 afm0Var, zje zjeVar) {
        super(zjeVar);
        this.j = afm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, 0L, null, null, 0L, this);
    }
}
