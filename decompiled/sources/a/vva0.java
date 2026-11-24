package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vva0 extends zje {
    public yva0 i;
    public String j;
    public Function1 k;
    public e2e l;
    public /* synthetic */ Object m;
    public final /* synthetic */ yva0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vva0(yva0 yva0Var, zje zjeVar) {
        super(zjeVar);
        this.n = yva0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, this);
    }
}
