package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zf40 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ nr30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf40(nr30 nr30Var, yje yjeVar) {
        super(yjeVar);
        this.k = nr30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
