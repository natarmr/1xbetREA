package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t8u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ u8u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8u(u8u u8uVar, zje zjeVar) {
        super(zjeVar);
        this.j = u8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.v(this);
    }
}
