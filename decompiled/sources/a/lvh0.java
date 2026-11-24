package a;

/* JADX INFO: loaded from: classes.dex */
public final class lvh0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pvh0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvh0(pvh0 pvh0Var, zje zjeVar) {
        super(zjeVar);
        this.j = pvh0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r1(this);
    }
}
