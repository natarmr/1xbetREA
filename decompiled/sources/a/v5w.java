package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class v5w extends zje {
    public Function1 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x5w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5w(x5w x5wVar, zje zjeVar) {
        super(zjeVar);
        this.k = x5wVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, this);
    }
}
