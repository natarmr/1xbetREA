package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xza extends zje {
    public String i;
    public d0b j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d0b l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xza(d0b d0bVar, zje zjeVar) {
        super(zjeVar);
        this.l = d0bVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this, null, false);
    }
}
