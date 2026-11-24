package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xbu extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ acu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbu(acu acuVar, yje yjeVar) {
        super(yjeVar);
        this.k = acuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
