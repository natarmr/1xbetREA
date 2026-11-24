package a;

/* JADX INFO: loaded from: classes.dex */
public final class hy2 extends zje {
    public j99 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ iy2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy2(iy2 iy2Var, zje zjeVar) {
        super(zjeVar);
        this.k = iy2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
