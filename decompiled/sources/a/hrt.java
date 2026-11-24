package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hrt extends zje {
    public ne5 i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public LinkedHashMap p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nmo r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrt(nmo nmoVar, zje zjeVar) {
        super(zjeVar);
        this.r = nmoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.g(this);
    }
}
