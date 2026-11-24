package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o5v extends zje {
    public txy i;
    public Function1 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dgu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5v(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.m = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, null, this);
    }
}
