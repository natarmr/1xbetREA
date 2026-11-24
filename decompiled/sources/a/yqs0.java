package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yqs0 extends zje {
    public y38 i;
    public int[] j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y38 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqs0(y38 y38Var, yje yjeVar) {
        super(yjeVar);
        this.l = y38Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
