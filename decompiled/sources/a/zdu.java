package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zdu extends zje {
    public bsu i;
    public bm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p4u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdu(p4u p4uVar, zje zjeVar) {
        super(zjeVar);
        this.l = p4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
