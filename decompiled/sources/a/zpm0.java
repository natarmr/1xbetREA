package a;

/* JADX INFO: loaded from: classes.dex */
public final class zpm0 extends zje {
    public xpm0 i;
    public pot0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ aqm0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpm0(aqm0 aqm0Var, zje zjeVar) {
        super(zjeVar);
        this.l = aqm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
