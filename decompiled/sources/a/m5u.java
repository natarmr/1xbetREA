package a;

/* JADX INFO: loaded from: classes4.dex */
public final class m5u extends zje {
    public q5u i;
    public /* synthetic */ Object j;
    public final /* synthetic */ q5u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5u(q5u q5uVar, zje zjeVar) {
        super(zjeVar);
        this.k = q5uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, 0, 0L, this);
    }
}
