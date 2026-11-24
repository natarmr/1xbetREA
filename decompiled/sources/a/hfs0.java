package a;

/* JADX INFO: loaded from: classes6.dex */
public final class hfs0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hcp0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfs0(hcp0 hcp0Var, zje zjeVar) {
        super(zjeVar);
        this.j = hcp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(null, null, this);
    }
}
