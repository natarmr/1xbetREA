package a;

/* JADX INFO: loaded from: classes5.dex */
public final class grx extends zje {
    public sff0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u8u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grx(u8u u8uVar, zje zjeVar) {
        super(zjeVar);
        this.k = u8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(this);
    }
}
