package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hm4 extends zje {
    public Function1 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ im4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm4(im4 im4Var, zje zjeVar) {
        super(zjeVar);
        this.k = im4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(null, null, this);
    }
}
