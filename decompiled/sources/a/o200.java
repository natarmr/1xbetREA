package a;

import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class o200 extends zje {
    public LimitNeGroupEnum i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r200 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o200(r200 r200Var, zje zjeVar) {
        super(zjeVar);
        this.k = r200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
