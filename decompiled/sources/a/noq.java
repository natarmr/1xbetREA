package a;

/* JADX INFO: loaded from: classes2.dex */
public final class noq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ vnq k;
    public Object l;
    public kmq m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noq(vnq vnqVar, yje yjeVar) {
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
