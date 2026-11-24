package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yt9 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yzn0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt9(yzn0 yzn0Var, zje zjeVar) {
        super(zjeVar);
        this.j = yzn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r(0, 0L, this, null);
    }
}
