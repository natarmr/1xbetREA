package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class grb extends zje {
    public String i;
    public String j;
    public String k;
    public mqb l;
    public hrb m;
    public List n;
    public List o;
    public String p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ hrb s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grb(hrb hrbVar, zje zjeVar) {
        super(zjeVar);
        this.s = hrbVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.w(null, null, null, this);
    }
}
