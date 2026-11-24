package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class muv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0q0 f22430a;
    public final fht0 b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public final pz40 i = androidx.compose.runtime.e.e(zsv0.f44926a);

    public muv0(h0q0 h0q0Var, fht0 fht0Var) {
        this.f22430a = h0q0Var;
        this.b = fht0Var;
    }

    public final Integer a() {
        if (!this.f ? false : this.f22430a.l().f3152a instanceof dsv0) {
            atv0 atv0Var = (atv0) ((hgk0) this.i).getValue();
            if (atv0Var instanceof xsv0) {
                return Integer.valueOf(((xsv0) atv0Var).f41437a);
            }
            if (atv0Var instanceof ysv0) {
                return Integer.valueOf(((ysv0) atv0Var).f43188a);
            }
            if (!Intrinsics.d(atv0Var, zsv0.f44926a)) {
                t9f.b();
                return null;
            }
        }
        return null;
    }

    public final boolean b() {
        return this.d > 0;
    }
}
