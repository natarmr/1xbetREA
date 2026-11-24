package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kru0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nmt0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kru0(nmt0 nmt0Var, zje zjeVar) {
        super(zjeVar);
        this.j = nmt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, null, this);
    }
}
