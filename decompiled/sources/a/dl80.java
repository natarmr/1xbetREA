package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dl80 extends zje {
    public boolean i;
    public byte j;
    public int k;
    public int l;
    public int m;
    public ArrayList n;
    public /* synthetic */ Object o;
    public final /* synthetic */ jcl p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl80(jcl jclVar, zje zjeVar) {
        super(zjeVar);
        this.p = jclVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(0, this, false);
    }
}
