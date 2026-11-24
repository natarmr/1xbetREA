package a;

import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class hhu extends zje {
    public LimitTypeEnum i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xfu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhu(xfu xfuVar, zje zjeVar) {
        super(zjeVar);
        this.k = xfuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
