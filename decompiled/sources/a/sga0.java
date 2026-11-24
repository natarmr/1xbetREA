package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class sga0 extends zje {
    public Iterator i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tga0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sga0(tga0 tga0Var, zje zjeVar) {
        super(zjeVar);
        this.k = tga0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
