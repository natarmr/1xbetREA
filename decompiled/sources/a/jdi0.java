package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jdi0 extends zje {
    public obk0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ldi0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdi0(ldi0 ldi0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ldi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.I(null, this);
    }
}
