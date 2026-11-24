package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mo extends zje {
    public aue0 i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ no l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(no noVar, yje yjeVar) {
        super(yjeVar);
        this.l = noVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
