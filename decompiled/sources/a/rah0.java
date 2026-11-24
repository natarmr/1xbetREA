package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rah0 implements bch0 {
    public static final v0h0 k = new v0h0(new w0h0(19), new x0h0(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cgk0 f30133a;
    public float g;
    public final cgk0 b = androidx.compose.runtime.e.b(0);
    public final cgk0 c = androidx.compose.runtime.e.b(0);
    public final pz40 d = androidx.compose.runtime.e.e(Boolean.FALSE);
    public final gy40 e = new gy40();
    public final cgk0 f = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
    public final ywj h = new ywj(new gwg0((Object) this, (byte) 6));
    public final zbk i = jgk0.b(new pdb(this, 3));
    public final zbk j = jgk0.b(new pdb(this, 4));

    public rah0(int i) {
        this.f30133a = androidx.compose.runtime.e.b(i);
    }

    @Override // a.bch0
    public final boolean a() {
        return this.h.a();
    }

    @Override // a.bch0
    public final Object b(c050 c050Var, Function2 function2, yje yjeVar) {
        Object objB = this.h.b(c050Var, function2, yjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    @Override // a.bch0
    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // a.bch0
    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // a.bch0
    public final float e(float f) {
        return this.h.e(f);
    }

    public final Object f(int i, cfq cfqVar, bnn0 bnn0Var) {
        Object objX = bww.x(this, i - this.f30133a.l(), cfqVar, bnn0Var);
        return objX == wne.f39444a ? objX : Unit.f46060a;
    }
}
