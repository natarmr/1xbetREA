package a;

/* JADX INFO: loaded from: classes3.dex */
public final class en3 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ lr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en3(lr lrVar, yje yjeVar) {
        super(yjeVar);
        this.k = lrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
