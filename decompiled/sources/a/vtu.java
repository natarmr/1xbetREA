package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vtu extends zje {
    public int i;
    public int j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ uii x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtu(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.x = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.y(0, this);
    }
}
