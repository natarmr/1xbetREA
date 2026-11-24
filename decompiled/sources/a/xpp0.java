package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xpp0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ lnq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpp0(lnq lnqVar, yje yjeVar) {
        super(yjeVar);
        this.k = lnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
