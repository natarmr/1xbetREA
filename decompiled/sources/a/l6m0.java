package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l6m0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pqu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6m0(pqu pquVar, yje yjeVar) {
        super(yjeVar);
        this.j = pquVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0, this);
    }
}
