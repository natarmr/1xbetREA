package a;

/* JADX INFO: loaded from: classes6.dex */
public final class xau0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ abu0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xau0(abu0 abu0Var, zje zjeVar) {
        super(zjeVar);
        this.j = abu0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(false, this);
    }
}
