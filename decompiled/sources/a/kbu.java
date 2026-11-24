package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kbu extends zje {
    public e1u i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lbu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbu(lbu lbuVar, zje zjeVar) {
        super(zjeVar);
        this.k = lbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(this);
    }
}
