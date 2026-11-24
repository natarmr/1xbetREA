package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class duu extends zje {
    public long i;
    public String j;
    public List k;
    public ArrayList l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ uii p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duu(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.p = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.u(0L, null, null, false, false, this);
    }
}
