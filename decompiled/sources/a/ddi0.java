package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ddi0 extends zje {
    public qfi0 i;
    public obk0 j;
    public sbi0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ldi0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddi0(ldi0 ldi0Var, zje zjeVar) {
        super(zjeVar);
        this.m = ldi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.F(null, null, this);
    }
}
