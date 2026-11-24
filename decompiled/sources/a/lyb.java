package a;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class lyb extends zje {
    public File i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h03 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyb(h03 h03Var, zje zjeVar) {
        super(zjeVar);
        this.k = h03Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.C(null, this);
    }
}
