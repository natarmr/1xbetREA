package a;

/* JADX INFO: loaded from: classes6.dex */
public final class gsr0 extends zje {
    public int i;
    public gxu j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gxu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsr0(gxu gxuVar, zje zjeVar) {
        super(zjeVar);
        this.l = gxuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(0, this);
    }
}
