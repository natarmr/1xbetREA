package a;

/* JADX INFO: loaded from: classes4.dex */
public final class cor0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y3v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cor0(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.k = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(0, this, null, null);
    }
}
