package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t7u extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u7u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7u(u7u u7uVar, zje zjeVar) {
        super(zjeVar);
        this.k = u7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
