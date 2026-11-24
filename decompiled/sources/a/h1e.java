package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class h1e extends q99 {
    public final i99 s;

    public h1e(int i, i99 i99Var, Function1 function1) {
        super(i, function1);
        this.s = i99Var;
        if (i99Var == i99.f14377a) {
            e9d0.u(sre0.f32672a.b(q99.class).J(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        c99.s(ua80.e(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // a.q99
    public final boolean B() {
        return this.s == i99.b;
    }

    public final Object Q(Object obj, boolean z) {
        Function1 function1;
        ss3 ss3VarF;
        if (this.s == i99.c) {
            Object objF = super.f(obj);
            if (!(objF instanceof ytb) || (objF instanceof xtb)) {
                return objF;
            }
            if (!z || (function1 = this.b) == null || (ss3VarF = vdx.F(function1, obj, null)) == null) {
                return Unit.f46060a;
            }
            throw ss3VarF;
        }
        Object obj2 = obj;
        Object obj3 = s99.d;
        aub aubVar = (aub) q99.h.get(this);
        while (true) {
            long andIncrement = q99.d.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zY = y(false, andIncrement);
            int i = s99.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (aubVar.d != j3) {
                aub aubVarO = o(j3, aubVar);
                if (aubVarO != null) {
                    aubVar = aubVarO;
                } else if (zY) {
                    return new xtb(u());
                }
            }
            int iN = N(aubVar, i2, obj2, j, obj3, zY);
            if (iN == 0) {
                aubVar.a();
                return Unit.f46060a;
            }
            if (iN == 1) {
                return Unit.f46060a;
            }
            if (iN == 2) {
                if (zY) {
                    aubVar.i();
                    return new xtb(u());
                }
                nvu0 nvu0Var = obj3 instanceof nvu0 ? (nvu0) obj3 : null;
                if (nvu0Var != null) {
                    nvu0Var.a(aubVar, i2 + i);
                }
                k((aubVar.d * j2) + ((long) i2));
                return Unit.f46060a;
            }
            if (iN == 3) {
                jf4.n("unexpected");
                return null;
            }
            if (iN == 4) {
                if (j < t()) {
                    aubVar.a();
                }
                return new xtb(u());
            }
            if (iN == 5) {
                aubVar.a();
            }
            obj2 = obj;
        }
    }

    @Override // a.q99, a.jbi0
    public final Object f(Object obj) {
        return Q(obj, false);
    }

    @Override // a.q99, a.jbi0
    public final Object m(yje yjeVar, Object obj) throws Throwable {
        ss3 ss3VarF;
        if (!(Q(obj, true) instanceof xtb)) {
            return Unit.f46060a;
        }
        Function1 function1 = this.b;
        if (function1 == null || (ss3VarF = vdx.F(function1, obj, null)) == null) {
            throw u();
        }
        tjo.a(ss3VarF, u());
        throw ss3VarF;
    }
}
