package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class vru extends zje {
    public String i;
    public Map j;
    public String k;
    public ieu l;
    public String m;
    public Map n;
    public String o;
    public String p;
    public String q;
    public ey r;
    public boolean s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ tzi y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vru(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.y = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.p(null, null, null, null, false, this);
    }
}
