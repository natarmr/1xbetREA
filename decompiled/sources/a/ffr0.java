package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ffr0 extends zje {
    public int i;
    public ofr0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ofr0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffr0(ofr0 ofr0Var, zje zjeVar) {
        super(zjeVar);
        this.l = ofr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.O(this);
    }
}
