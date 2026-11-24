package a;

/* JADX INFO: loaded from: classes3.dex */
public final class s0u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ t0u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0u(t0u t0uVar, yje yjeVar) {
        super(yjeVar);
        this.j = t0uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
