package a;

/* JADX INFO: loaded from: classes4.dex */
public final class m3u extends zje {
    public d4u i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d4u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3u(d4u d4uVar, zje zjeVar) {
        super(zjeVar);
        this.k = d4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0, this, null);
    }
}
