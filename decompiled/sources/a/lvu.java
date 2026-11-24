package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lvu extends zje {
    public String i;
    public z220 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lbu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvu(lbu lbuVar, zje zjeVar) {
        super(zjeVar);
        this.l = lbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, this);
    }
}
