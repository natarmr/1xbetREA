package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vrt extends zje {
    public int i;
    public int j;
    public bwl k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wrt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrt(wrt wrtVar, zje zjeVar) {
        super(zjeVar);
        this.m = wrtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}
