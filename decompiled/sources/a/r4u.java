package a;

/* JADX INFO: loaded from: classes4.dex */
public final class r4u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ivn j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4u(ivn ivnVar, zje zjeVar) {
        super(zjeVar);
        this.j = ivnVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(0, 0, this);
    }
}
