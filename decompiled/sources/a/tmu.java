package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tmu extends zje {
    public boolean i;
    public is j;
    public /* synthetic */ Object k;
    public final /* synthetic */ is l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmu(is isVar, zje zjeVar) {
        super(zjeVar);
        this.l = isVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(false, this);
    }
}
