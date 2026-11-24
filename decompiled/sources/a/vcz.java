package a;

/* JADX INFO: loaded from: classes.dex */
public final class vcz extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xcz j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcz(xcz xczVar, yje yjeVar) {
        super(yjeVar);
        this.j = xczVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(0, 0, this);
    }
}
