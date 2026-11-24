package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zsk extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ atk j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsk(atk atkVar, zje zjeVar) {
        super(zjeVar);
        this.j = atkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.W(null, false, this);
    }
}
