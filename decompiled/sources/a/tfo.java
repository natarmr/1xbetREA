package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tfo extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zfo j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfo(zfo zfoVar, zje zjeVar) {
        super(zjeVar);
        this.j = zfoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}
