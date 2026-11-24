package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y120 extends zje {
    public w220 i;
    public m2c0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w220 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y120(w220 w220Var, zje zjeVar) {
        super(zjeVar);
        this.l = w220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.D(this);
    }
}
