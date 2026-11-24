package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jku extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ cku k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jku(cku ckuVar, yje yjeVar) {
        super(yjeVar);
        this.k = ckuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
