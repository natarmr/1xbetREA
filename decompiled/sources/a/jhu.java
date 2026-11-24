package a;

import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class jhu extends zje {
    public LimitTypeEnum i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wdu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.k = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, null, this);
    }
}
