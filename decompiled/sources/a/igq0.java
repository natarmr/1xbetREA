package a;

/* JADX INFO: loaded from: classes6.dex */
public final class igq0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kgq0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igq0(kgq0 kgq0Var, zje zjeVar) {
        super(zjeVar);
        this.j = kgq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0L, 0, 0, 0, null, 0L, this);
    }
}
