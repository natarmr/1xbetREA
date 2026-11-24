package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t4a extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ u4a j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4a(u4a u4aVar, yje yjeVar) {
        super(yjeVar);
        this.j = u4aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
