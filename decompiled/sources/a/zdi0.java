package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zdi0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ aei0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdi0(aei0 aei0Var, zje zjeVar) {
        super(zjeVar);
        this.j = aei0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
