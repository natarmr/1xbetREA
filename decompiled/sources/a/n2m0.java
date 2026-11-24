package a;

import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final class n2m0 extends zje {
    public TypeStageId i;
    public /* synthetic */ Object j;
    public final /* synthetic */ q2m0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2m0(q2m0 q2m0Var, zje zjeVar) {
        super(zjeVar);
        this.k = q2m0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
