package a;

/* JADX INFO: loaded from: classes.dex */
public final class vu6 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ chf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu6(chf0 chf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = chf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.t(0L, this);
    }
}
