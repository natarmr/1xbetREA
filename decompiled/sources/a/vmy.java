package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vmy extends zje {
    public boolean i;
    public z8w0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ u8u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmy(u8u u8uVar, zje zjeVar) {
        super(zjeVar);
        this.l = u8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(false, this);
    }
}
