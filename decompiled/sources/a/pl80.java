package a;

/* JADX INFO: loaded from: classes7.dex */
public final class pl80 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ vnq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl80(vnq vnqVar, yje yjeVar) {
        super(yjeVar);
        this.l = vnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
