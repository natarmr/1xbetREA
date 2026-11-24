package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tfi0 extends zje {
    public vh80 i;
    public List j;
    public Object k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ufi0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfi0(ufi0 ufi0Var, zje zjeVar) {
        super(zjeVar);
        this.o = ufi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, this);
    }
}
