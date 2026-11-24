package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qqe extends zje {
    public int i;
    public uqe j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uqe l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqe(uqe uqeVar, zje zjeVar) {
        super(zjeVar);
        this.l = uqeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(0, this);
    }
}
