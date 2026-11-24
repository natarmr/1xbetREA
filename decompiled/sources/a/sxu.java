package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sxu extends zje {
    public double i;
    public double j;
    public hru k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hru m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxu(hru hruVar, zje zjeVar) {
        super(zjeVar);
        this.m = hruVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(0.0d, 0.0d, 0, 0, 0L, this, null);
    }
}
