package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gns0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ epi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gns0(epi0 epi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = epi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(0L, this);
    }
}
