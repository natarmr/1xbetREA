package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hdp extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ phf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdp(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
