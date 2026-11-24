package a;

/* JADX INFO: loaded from: classes6.dex */
public final class p20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ s20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p20(s20 s20Var, zje zjeVar) {
        super(zjeVar);
        this.j = s20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(false, this);
    }
}
