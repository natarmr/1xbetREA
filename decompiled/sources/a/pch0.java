package a;

/* JADX INFO: loaded from: classes.dex */
public final class pch0 extends zje {
    public lie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sch0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pch0(sch0 sch0Var, zje zjeVar) {
        super(zjeVar);
        this.k = sch0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this);
    }
}
