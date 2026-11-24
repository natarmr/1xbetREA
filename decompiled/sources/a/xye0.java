package a;

import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class xye0 extends zje {
    public CountryStateModel i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eze0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xye0(eze0 eze0Var, zje zjeVar) {
        super(zjeVar);
        this.k = eze0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.Y(this);
    }
}
