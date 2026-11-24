package a;

/* JADX INFO: loaded from: classes2.dex */
public final class unq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ vnq k;
    public Object l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unq(vnq vnqVar, yje yjeVar) {
        super(yjeVar);
        this.k = vnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
