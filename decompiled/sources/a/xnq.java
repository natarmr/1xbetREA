package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xnq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public int l;
    public final /* synthetic */ vnq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnq(vnq vnqVar, yje yjeVar) {
        super(yjeVar);
        this.m = vnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
