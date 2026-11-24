package a;

import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class ihu extends zje {
    public LimitTypeEnum i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yfu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihu(yfu yfuVar, zje zjeVar) {
        super(zjeVar);
        this.k = yfuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
