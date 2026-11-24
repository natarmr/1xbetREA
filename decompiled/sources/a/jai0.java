package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jai0 extends w46 {
    public final vzg0 b;
    public final i1w0 c;
    public final ciu d;
    public final f5a e;
    public final vd1 f;
    public final duj g;
    public final p7m0 h = q7m0.a(Boolean.TRUE);
    public final p7m0 i;
    public final ol60 j;
    public byte k;

    public jai0(vzg0 vzg0Var, i1w0 i1w0Var, ciu ciuVar, f5a f5aVar, vd1 vd1Var, duj dujVar) {
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = ciuVar;
        this.e = f5aVar;
        this.f = vd1Var;
        this.g = dujVar;
        zie0 zie0Var = g9i0.b;
        Integer num = (Integer) vzg0Var.a("CURRENT_SELECTED_LIMIT_BUNDLE_KEY");
        byte b = 1;
        int iIntValue = num != null ? num.intValue() : 1;
        zie0Var.getClass();
        this.i = q7m0.a(new iai0(zie0.a(iIntValue)));
        this.j = new ol60(1, i99.b);
        this.k = (byte) 1;
        sac.V(jiu0.a(this), new dai0(this, b), new eai0(this, (byte) 1), null, new yng0(this, null, (byte) 11), 12);
    }

    public final void w(hai0 hai0Var) {
        sac.V(jiu0.a(this), new eoh0((byte) 21), null, null, new bai0(this, hai0Var, null, (byte) 1), 14);
    }

    public final void x(g9i0 g9i0Var) {
        p7m0 p7m0Var;
        Object value;
        g9i0Var.getClass();
        byte b = g9i0Var.f10915a;
        this.k = b;
        this.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", Integer.valueOf(b));
        do {
            p7m0Var = this.i;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new iai0(g9i0Var)));
    }
}
