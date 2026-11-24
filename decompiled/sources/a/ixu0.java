package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ixu0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fuj0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixu0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.G(0L, 0L, this, null);
    }
}
