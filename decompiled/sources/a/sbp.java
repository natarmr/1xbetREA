package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sbp extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ccp j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbp(ccp ccpVar, zje zjeVar) {
        super(zjeVar);
        this.j = ccpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Q(this);
    }
}
