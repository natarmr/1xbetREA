package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ov80 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rv80 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov80(rv80 rv80Var, zje zjeVar) {
        super(zjeVar);
        this.j = rv80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.S(this);
    }
}
