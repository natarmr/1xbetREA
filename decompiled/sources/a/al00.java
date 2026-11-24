package a;

/* JADX INFO: loaded from: classes4.dex */
public final class al00 extends zje {
    public sff0 i;
    public ql5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pzu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al00(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.l = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d0(this);
    }
}
