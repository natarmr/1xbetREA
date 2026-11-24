package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jm90 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kd30 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm90(kd30 kd30Var, zje zjeVar) {
        super(zjeVar);
        this.j = kd30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a0(null, null, this);
    }
}
