package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tdy extends zje {
    public jrj i;
    public u3u0 j;
    public LinkedHashMap k;
    public String l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ u3u0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdy(u3u0 u3u0Var, zw5 zw5Var) {
        super(zw5Var);
        this.o = u3u0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(null, this);
    }
}
