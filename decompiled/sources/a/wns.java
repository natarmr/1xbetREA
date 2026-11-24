package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wns extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g7s j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wns(g7s g7sVar, yje yjeVar) {
        super(yjeVar);
        this.j = g7sVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(false, this);
    }
}
