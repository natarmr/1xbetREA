package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uff0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ vff0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uff0(vff0 vff0Var, zje zjeVar) {
        super(zjeVar);
        this.j = vff0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, false, this);
    }
}
