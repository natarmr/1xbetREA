package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jys extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ kys k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jys(kys kysVar, yje yjeVar) {
        super(yjeVar);
        this.k = kysVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
