package a;

/* JADX INFO: loaded from: classes4.dex */
public final class d670 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ hpt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d670(hpt hptVar, yje yjeVar) {
        super(yjeVar);
        this.k = hptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
