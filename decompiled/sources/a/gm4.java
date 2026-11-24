package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gm4 extends zje {
    public xl4 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ im4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm4(im4 im4Var, yje yjeVar) {
        super(yjeVar);
        this.k = im4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
