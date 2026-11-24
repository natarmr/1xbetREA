package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ty7 extends zje {
    public j08 i;
    public cdq0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yy7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty7(yy7 yy7Var, zje zjeVar) {
        super(zjeVar);
        this.l = yy7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, this);
    }
}
