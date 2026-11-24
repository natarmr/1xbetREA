package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xaq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ebq j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaq(ebq ebqVar, zje zjeVar) {
        super(zjeVar);
        this.j = ebqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(this);
    }
}
