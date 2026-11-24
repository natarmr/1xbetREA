package a;

/* JADX INFO: loaded from: classes.dex */
public final class r8e extends zje {
    public String i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g45 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8e(g45 g45Var, zje zjeVar) {
        super(zjeVar);
        this.l = g45Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.Z(null, null, null, null, null, null, null, null, false, this);
    }
}
