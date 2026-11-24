package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dtv0 extends zje {
    public kie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ etv0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtv0(etv0 etv0Var, zje zjeVar) {
        super(zjeVar);
        this.k = etv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a1(0, this);
    }
}
