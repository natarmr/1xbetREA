package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qau extends zje {
    public boolean i;
    public sff0 j;
    public c5q k;
    public /* synthetic */ Object l;
    public final /* synthetic */ lau m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qau(lau lauVar, zje zjeVar) {
        super(zjeVar);
        this.m = lauVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
