package a;

/* JADX INFO: loaded from: classes5.dex */
public final class efj0 extends zje {
    public org.xplatform.settings.impl.presentation.a i;
    public /* synthetic */ Object j;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efj0(org.xplatform.settings.impl.presentation.a aVar, zje zjeVar) {
        super(zjeVar);
        this.k = aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.J(this);
    }
}
