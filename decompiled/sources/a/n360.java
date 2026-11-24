package a;

/* JADX INFO: loaded from: classes4.dex */
public final class n360 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ v360 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n360(v360 v360Var, zje zjeVar) {
        super(zjeVar);
        this.j = v360Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f0(this);
    }
}
