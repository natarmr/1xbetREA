package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dkf0 extends zje {
    public Object i;
    public gkf0 j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ekf0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkf0(ekf0 ekf0Var, zje zjeVar) {
        super(zjeVar);
        this.m = ekf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, 0L, this);
    }
}
