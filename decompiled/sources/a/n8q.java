package a;

/* JADX INFO: loaded from: classes4.dex */
public final class n8q extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r8q j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8q(r8q r8qVar, zje zjeVar) {
        super(zjeVar);
        this.j = r8qVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(this);
    }
}
