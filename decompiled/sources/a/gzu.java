package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gzu extends zje {
    public lbu i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hzu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzu(hzu hzuVar, zje zjeVar) {
        super(zjeVar);
        this.k = hzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
