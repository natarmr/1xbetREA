package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xn00 extends zje {
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ edu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn00(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.l = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(this);
    }
}
