package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vlu extends zje {
    public pek i;
    public /* synthetic */ Object j;
    public final /* synthetic */ edu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlu(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.k = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
