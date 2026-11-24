package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bk80 extends zje {
    public lk80 i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sd60 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk80(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.l = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(null, this);
    }
}
