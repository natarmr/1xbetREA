package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f5v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ i5v k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5v(i5v i5vVar, yje yjeVar) {
        super(yjeVar);
        this.k = i5vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
