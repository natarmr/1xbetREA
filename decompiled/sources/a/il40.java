package a;

/* JADX INFO: loaded from: classes4.dex */
public final class il40 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nl40 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il40(nl40 nl40Var, zje zjeVar) {
        super(zjeVar);
        this.j = nl40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
