package a;

/* JADX INFO: loaded from: classes.dex */
public final class tzp extends zje {
    public boolean i;
    public nzp j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vzp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzp(vzp vzpVar, zje zjeVar) {
        super(zjeVar);
        this.l = vzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
