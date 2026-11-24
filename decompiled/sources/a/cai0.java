package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cai0 extends w46 {
    public final vzg0 b;
    public final i1w0 c;
    public final f5a d;
    public final vd1 e;
    public final duj f;
    public final p7m0 g = q7m0.a(Boolean.FALSE);
    public final p7m0 h = q7m0.a(z9i0.f44021a);
    public final ol60 i = new ol60(1, i99.b);
    public short j = 1;

    public cai0(vzg0 vzg0Var, i1w0 i1w0Var, f5a f5aVar, vd1 vd1Var, duj dujVar) {
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = f5aVar;
        this.e = vd1Var;
        this.f = dujVar;
    }

    public final void w(x9i0 x9i0Var) {
        sac.V(jiu0.a(this), new eoh0((byte) 20), null, null, new bai0(this, x9i0Var, null, (byte) 0), 14);
    }

    public final void x(f9i0 f9i0Var) {
        p7m0 p7m0Var;
        Object value;
        f9i0Var.getClass();
        short s = f9i0Var.f9154a;
        this.j = s;
        this.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", Integer.valueOf(s));
        do {
            p7m0Var = this.h;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new y9i0(f9i0Var)));
    }
}
