package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jj extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ kj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(kj kjVar, yje yjeVar) {
        super(yjeVar);
        this.k = kjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
