package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u6a extends zje {
    public String i;
    public String j;
    public iqi k;
    public LinkedHashMap l;
    public LinkedHashMap m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gr00 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6a(gr00 gr00Var, zje zjeVar) {
        super(zjeVar);
        this.o = gr00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.l(null, null, this);
    }
}
