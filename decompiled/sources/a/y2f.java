package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y2f extends zje {
    public int i;
    public vor0 j;
    public n3w k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a3f m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2f(a3f a3fVar, zje zjeVar) {
        super(zjeVar);
        this.m = a3fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.O(this);
    }
}
