package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kt10 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ b4v k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt10(b4v b4vVar, yje yjeVar) {
        super(yjeVar);
        this.k = b4vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
