package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mnq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ exn j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnq(exn exnVar, yje yjeVar) {
        super(yjeVar);
        this.j = exnVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
