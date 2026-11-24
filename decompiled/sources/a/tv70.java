package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class tv70 extends zje {
    public int i;
    public int j;
    public int k;
    public Function1 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ wv70 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv70(wv70 wv70Var, zje zjeVar) {
        super(zjeVar);
        this.n = wv70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.l(0, 0, 0, this);
    }
}
