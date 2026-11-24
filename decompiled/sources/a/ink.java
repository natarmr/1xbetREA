package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ink extends zje {
    public String i;
    public ts4 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jnk l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ink(jnk jnkVar, zje zjeVar) {
        super(zjeVar);
        this.l = jnkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
