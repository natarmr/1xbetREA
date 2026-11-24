package a;

/* JADX INFO: loaded from: classes4.dex */
public final class skw extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ukw j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skw(ukw ukwVar, zje zjeVar) {
        super(zjeVar);
        this.j = ukwVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Y(null, false, this);
    }
}
