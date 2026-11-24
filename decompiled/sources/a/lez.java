package a;

/* JADX INFO: loaded from: classes.dex */
public final class lez extends zje {
    public c050 i;
    public bnn0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mez l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lez(mez mezVar, yje yjeVar) {
        super(yjeVar);
        this.l = mezVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, this);
    }
}
