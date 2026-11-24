package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xyn0 extends zje {
    public fuj0 i;
    public i050 j;
    public List k;
    public Iterator l;
    public List m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ zyn0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyn0(zyn0 zyn0Var, zje zjeVar) {
        super(zjeVar);
        this.p = zyn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.Z(this);
    }
}
