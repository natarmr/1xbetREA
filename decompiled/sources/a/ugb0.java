package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ugb0 extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wgb0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugb0(wgb0 wgb0Var, zje zjeVar) {
        super(zjeVar);
        this.k = wgb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
