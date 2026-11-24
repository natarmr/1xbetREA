package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mhf0 extends zje {
    public h9n0 i;
    public n7p j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nhf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhf0(nhf0 nhf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = nhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.v(null, null, this);
    }
}
