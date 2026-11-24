package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b06 extends zje {
    public yh7 i;
    public ql5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d06 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b06(d06 d06Var, zje zjeVar) {
        super(zjeVar);
        this.l = d06Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.z(null, null, this);
    }
}
