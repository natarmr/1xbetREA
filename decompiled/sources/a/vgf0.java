package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vgf0 extends zje {
    public i050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wgf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgf0(wgf0 wgf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = wgf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
