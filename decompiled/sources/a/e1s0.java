package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e1s0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ drm0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1s0(drm0 drm0Var, zje zjeVar) {
        super(zjeVar);
        this.j = drm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, this, null);
    }
}
