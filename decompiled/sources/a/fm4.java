package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fm4 extends zje {
    public uu4 i;
    public String j;
    public Function2 k;
    public String l;
    public m2c0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ im4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm4(im4 im4Var, zje zjeVar) {
        super(zjeVar);
        this.o = im4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(null, null, null, null, this);
    }
}
