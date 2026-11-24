package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yye0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ eze0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yye0(eze0 eze0Var, zje zjeVar) {
        super(zjeVar);
        this.j = eze0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Z(this);
    }
}
