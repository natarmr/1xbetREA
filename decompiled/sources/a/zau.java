package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zau extends zje {
    public long i;
    public boolean j;
    public hsj k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ hsj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zau(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.o = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.p(0L, this, false);
    }
}
