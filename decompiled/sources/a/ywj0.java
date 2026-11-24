package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ywj0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yxj0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywj0(yxj0 yxj0Var, zje zjeVar) {
        super(zjeVar);
        this.j = yxj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.E(this);
    }
}
