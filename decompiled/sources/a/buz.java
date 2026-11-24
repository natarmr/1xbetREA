package a;

/* JADX INFO: loaded from: classes2.dex */
public final class buz extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ euz j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buz(euz euzVar, zje zjeVar) {
        super(zjeVar);
        this.j = euzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
