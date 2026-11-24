package a;

/* JADX INFO: loaded from: classes.dex */
public final class nds0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pds0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nds0(pds0 pds0Var, zje zjeVar) {
        super(zjeVar);
        this.j = pds0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, null, this);
    }
}
