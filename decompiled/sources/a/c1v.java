package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c1v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ d1v k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1v(d1v d1vVar, yje yjeVar) {
        super(yjeVar);
        this.k = d1vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
