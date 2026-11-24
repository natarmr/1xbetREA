package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t5w extends zje {
    public km80 i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x5w l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5w(x5w x5wVar, zje zjeVar) {
        super(zjeVar);
        this.l = x5wVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, this);
    }
}
