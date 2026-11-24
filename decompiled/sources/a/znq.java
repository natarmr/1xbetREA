package a;

/* JADX INFO: loaded from: classes4.dex */
public final class znq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ uap j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znq(uap uapVar, yje yjeVar) {
        super(yjeVar);
        this.j = uapVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
