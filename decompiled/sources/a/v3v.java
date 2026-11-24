package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v3v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ q3v k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3v(q3v q3vVar, yje yjeVar) {
        super(yjeVar);
        this.k = q3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
