package a;

/* JADX INFO: loaded from: classes.dex */
public final class zaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vne f44088a;
    public final afv b;
    public final y2x c;
    public cfq d;
    public cfq e;
    public cfq f;
    public boolean g;
    public final pz40 h;
    public final pz40 i;
    public final pz40 j;
    public final pz40 k;
    public long l;
    public long m;
    public long n;
    public dfv o;
    public final t33 p;
    public final t33 q;
    public final pz40 r;

    public zaz(vne vneVar, afv afvVar, y2x y2xVar) {
        this.f44088a = vneVar;
        this.b = afvVar;
        this.c = y2xVar;
        Boolean bool = Boolean.FALSE;
        this.h = androidx.compose.runtime.e.e(bool);
        this.i = androidx.compose.runtime.e.e(bool);
        this.j = androidx.compose.runtime.e.e(bool);
        this.k = androidx.compose.runtime.e.e(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        Object obj = null;
        this.o = afvVar != null ? afvVar.b() : null;
        int i = 12;
        this.p = new t33(new ikx(0L), hp4.p, obj, i);
        this.q = new t33(Float.valueOf(1.0f), hp4.j, obj, i);
        this.r = androidx.compose.runtime.e.e(new ikx(0L));
    }

    public final void a() {
        dfv dfvVar = this.o;
        cfq cfqVar = this.d;
        pz40 pz40Var = this.i;
        boolean zBooleanValue = ((Boolean) ((hgk0) pz40Var).getValue()).booleanValue();
        vne vneVar = this.f44088a;
        yje yjeVar = null;
        if (zBooleanValue || cfqVar == null || dfvVar == null) {
            if (c()) {
                if (dfvVar != null) {
                    dfvVar.g(1.0f);
                }
                qjj.W(vneVar, null, null, new xaz(this, yjeVar, (byte) 0), 3);
                return;
            }
            return;
        }
        ((hgk0) pz40Var).setValue(Boolean.TRUE);
        boolean zC = c();
        boolean z = !zC;
        if (!zC) {
            dfvVar.g(0.0f);
        }
        qjj.W(vneVar, null, null, new lv(z, this, cfqVar, dfvVar, null, (byte) 9), 3);
    }

    public final void b() {
        if (((Boolean) ((hgk0) this.h).getValue()).booleanValue()) {
            qjj.W(this.f44088a, null, null, new xaz(this, null, (byte) 1), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) ((hgk0) this.j).getValue()).booleanValue();
    }

    public final void d() {
        afv afvVar;
        pz40 pz40Var = this.h;
        boolean zBooleanValue = ((Boolean) ((hgk0) pz40Var).getValue()).booleanValue();
        byte b = 3;
        vne vneVar = this.f44088a;
        yje yjeVar = null;
        if (zBooleanValue) {
            ((hgk0) pz40Var).setValue(Boolean.FALSE);
            qjj.W(vneVar, null, null, new xaz(this, yjeVar, (byte) 2), 3);
        }
        pz40 pz40Var2 = this.i;
        if (((Boolean) ((hgk0) pz40Var2).getValue()).booleanValue()) {
            ((hgk0) pz40Var2).setValue(Boolean.FALSE);
            qjj.W(vneVar, null, null, new xaz(this, yjeVar, b), 3);
        }
        if (c()) {
            ((hgk0) this.j).setValue(Boolean.FALSE);
            qjj.W(vneVar, null, null, new xaz(this, yjeVar, (byte) 4), 3);
        }
        this.g = false;
        e(0L);
        this.l = 9223372034707292159L;
        dfv dfvVar = this.o;
        if (dfvVar != null && (afvVar = this.b) != null) {
            afvVar.c(dfvVar);
        }
        this.o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void e(long j) {
        ((hgk0) this.r).setValue(new ikx(j));
    }
}
