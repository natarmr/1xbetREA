package a;

/* JADX INFO: loaded from: classes6.dex */
public final class kkn0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ mkn0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkn0(mkn0 mkn0Var, zje zjeVar) {
        super(zjeVar);
        this.j = mkn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}
