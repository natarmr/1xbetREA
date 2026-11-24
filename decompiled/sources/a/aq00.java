package a;

/* JADX INFO: loaded from: classes3.dex */
public final class aq00 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bq00 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq00(bq00 bq00Var, zje zjeVar) {
        super(zjeVar);
        this.j = bq00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.R(this);
    }
}
