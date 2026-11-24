package a;

/* JADX INFO: loaded from: classes3.dex */
public final class oda0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nr00 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oda0(nr00 nr00Var, zje zjeVar) {
        super(zjeVar);
        this.j = nr00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(0L, this, null);
    }
}
