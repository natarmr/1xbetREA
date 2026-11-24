package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rwu extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ mdq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwu(mdq mdqVar, yje yjeVar) {
        super(yjeVar);
        this.k = mdqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
