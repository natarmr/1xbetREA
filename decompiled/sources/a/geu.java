package a;

/* JADX INFO: loaded from: classes3.dex */
public final class geu extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bot k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geu(bot botVar, zje zjeVar) {
        super(zjeVar);
        this.k = botVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
