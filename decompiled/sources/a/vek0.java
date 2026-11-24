package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vek0 extends zje {
    public Function1 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ afk0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vek0(afk0 afk0Var, zje zjeVar) {
        super(zjeVar);
        this.k = afk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, 0.0f, null, this);
    }
}
