package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hjd0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ijd0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjd0(ijd0 ijd0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ijd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(this);
    }
}
