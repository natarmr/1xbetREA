package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jzq0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ roi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzq0(roi0 roi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = roi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(null, null, null, this);
    }
}
