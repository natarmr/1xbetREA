package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xqs0 extends zje {
    public int[] i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h5v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqs0(h5v h5vVar, yje yjeVar) {
        super(yjeVar);
        this.k = h5vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
