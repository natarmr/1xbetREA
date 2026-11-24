package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jd7 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kd7 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd7(kd7 kd7Var, zje zjeVar) {
        super(zjeVar);
        this.j = kd7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.W(null, this);
    }
}
