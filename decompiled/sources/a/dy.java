package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dy extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nhf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(nhf0 nhf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = nhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(0L, this);
    }
}
