package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vzu extends zje {
    public w5z i;
    public jvn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a6u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzu(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.l = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(this);
    }
}
