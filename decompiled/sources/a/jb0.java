package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jb0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kb0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(kb0 kb0Var, zje zjeVar) {
        super(zjeVar);
        this.j = kb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
