package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ynq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public int l;
    public final /* synthetic */ o4m m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynq(o4m o4mVar, yje yjeVar) {
        super(yjeVar);
        this.m = o4mVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
