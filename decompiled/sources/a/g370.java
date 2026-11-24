package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g370 extends zje {
    public Function1 i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k370 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g370(k370 k370Var, zje zjeVar) {
        super(zjeVar);
        this.n = k370Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object objB = this.n.B(null, this);
        return objB == wne.f39444a ? objB : new j0g0(objB);
    }
}
