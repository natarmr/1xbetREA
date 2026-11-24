package a;

/* JADX INFO: loaded from: classes5.dex */
public final class zxd extends zje {
    public we50 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kyd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxd(kyd kydVar, zje zjeVar) {
        super(zjeVar);
        this.k = kydVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(null, null, this);
    }
}
