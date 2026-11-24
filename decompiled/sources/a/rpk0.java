package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rpk0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ div k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpk0(div divVar, yje yjeVar) {
        super(yjeVar);
        this.k = divVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
