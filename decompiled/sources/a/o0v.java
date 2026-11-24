package a;

/* JADX INFO: loaded from: classes3.dex */
public final class o0v extends zje {
    public boolean i;
    public boolean j;
    public bnn0 k;
    public hie0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tzi n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0v(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.n = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.i(false, false, false, null, this);
    }
}
