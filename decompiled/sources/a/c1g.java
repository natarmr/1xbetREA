package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c1g extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ d1g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1g(d1g d1gVar, yje yjeVar) {
        super(yjeVar);
        this.k = d1gVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
