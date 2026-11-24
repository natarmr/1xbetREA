package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ivs extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ uap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivs(uap uapVar, yje yjeVar) {
        super(yjeVar);
        this.k = uapVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
