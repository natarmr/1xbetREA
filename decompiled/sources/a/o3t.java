package a;

/* JADX INFO: loaded from: classes3.dex */
public final class o3t extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ q3t j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3t(q3t q3tVar, yje yjeVar) {
        super(yjeVar);
        this.j = q3tVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(null, this);
    }
}
