package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l06 extends zje {
    public km80 i;
    public m06 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ m06 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l06(m06 m06Var, zje zjeVar) {
        super(zjeVar);
        this.l = m06Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
