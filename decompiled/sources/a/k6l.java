package a;

/* JADX INFO: loaded from: classes4.dex */
public final class k6l extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rrc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6l(rrc rrcVar, zje zjeVar) {
        super(zjeVar);
        this.j = rrcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(0, this, null);
    }
}
