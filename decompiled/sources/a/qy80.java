package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qy80 extends zje {
    public sip i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y3v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy80(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.l = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, this);
    }
}
