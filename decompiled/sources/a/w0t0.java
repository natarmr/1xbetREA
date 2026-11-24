package a;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class w0t0 extends zje {
    public String i;
    public File j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x0t0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0t0(x0t0 x0t0Var, zje zjeVar) {
        super(zjeVar);
        this.l = x0t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
