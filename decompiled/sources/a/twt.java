package a;

/* JADX INFO: loaded from: classes3.dex */
public final class twt extends zje {
    public z7b[] i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hsj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twt(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.k = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r(null, this);
    }
}
