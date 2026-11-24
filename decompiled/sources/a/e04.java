package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e04 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ na k;
    public h7d l;
    public kmq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e04(na naVar, yje yjeVar) {
        super(yjeVar);
        this.k = naVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
