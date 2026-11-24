package a;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c5v extends zje {
    public qmu0 i;
    public String j;
    public List k;
    public Object l;
    public LinkedHashSet m;
    public boolean n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ j5v r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5v(j5v j5vVar, zje zjeVar) {
        super(zjeVar);
        this.r = j5vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, false, this);
    }
}
