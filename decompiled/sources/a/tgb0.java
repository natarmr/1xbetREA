package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tgb0 extends zje {
    public boolean i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wgb0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgb0(wgb0 wgb0Var, zje zjeVar) {
        super(zjeVar);
        this.l = wgb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(false, this);
    }
}
