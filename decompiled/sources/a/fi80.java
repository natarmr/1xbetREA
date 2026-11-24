package a;

/* JADX INFO: loaded from: classes.dex */
public final class fi80 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ uuu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi80(uuu uuuVar, yje yjeVar) {
        super(yjeVar);
        this.k = uuuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
