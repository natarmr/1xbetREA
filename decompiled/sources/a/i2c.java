package a;

/* JADX INFO: loaded from: classes5.dex */
public final class i2c extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ k2c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2c(k2c k2cVar, yje yjeVar) {
        super(yjeVar);
        this.k = k2cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
