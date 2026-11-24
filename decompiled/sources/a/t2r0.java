package a;

/* JADX INFO: loaded from: classes4.dex */
public final class t2r0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ z2r0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2r0(z2r0 z2r0Var, zje zjeVar) {
        super(zjeVar);
        this.j = z2r0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
