package a;

/* JADX INFO: loaded from: classes5.dex */
public final class fhb0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ihb0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhb0(ihb0 ihb0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ihb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
