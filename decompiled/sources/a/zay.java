package a;

/* JADX INFO: loaded from: classes.dex */
public final class zay extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tyc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zay(tyc tycVar, zje zjeVar) {
        super(zjeVar);
        this.k = tycVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e0(this);
    }
}
