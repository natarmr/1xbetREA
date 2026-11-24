package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ugf extends zje {
    public kwd i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vgf k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugf(vgf vgfVar, zje zjeVar) {
        super(zjeVar);
        this.k = vgfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0.0d, 0L, this, null);
    }
}
