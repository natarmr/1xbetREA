package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hkw0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkw0 f13228a;
    public jkw0 b;

    public hkw0(jkw0 jkw0Var) {
        this.f13228a = jkw0Var;
        if (jkw0Var.s()) {
            jf4.o("Default instance must be immutable.");
            throw null;
        }
        this.b = jkw0Var.p();
    }

    public static void b(jkw0 jkw0Var, jkw0 jkw0Var2) {
        clw0 clw0Var = clw0.b;
        clw0Var.getClass();
        clw0Var.a(jkw0Var.getClass()).i(jkw0Var, jkw0Var2);
    }

    public final void a(jkw0 jkw0Var) {
        jkw0 jkw0Var2 = this.f13228a;
        if (jkw0Var != null && !jkw0Var2.getClass().isInstance(jkw0Var)) {
            jf4.o("mergeFrom(MessageLite) can only merge messages of the same type.");
        } else {
            if (jkw0Var2.equals(jkw0Var)) {
                return;
            }
            if (!this.b.s()) {
                e();
            }
            b(this.b, jkw0Var);
        }
    }

    public final jkw0 c() {
        boolean zS = this.b.s();
        jkw0 jkw0Var = this.b;
        if (zS) {
            jkw0Var.q();
            jkw0Var = this.b;
        }
        jkw0Var.getClass();
        if (jkw0.n(jkw0Var, true)) {
            return jkw0Var;
        }
        throw new ilw0();
    }

    public final Object clone() {
        hkw0 hkw0Var = (hkw0) this.f13228a.h(5);
        boolean zS = this.b.s();
        jkw0 jkw0Var = this.b;
        if (zS) {
            jkw0Var.q();
            jkw0Var = this.b;
        }
        hkw0Var.b = jkw0Var;
        return hkw0Var;
    }

    public final void d() {
        if (this.b.s()) {
            return;
        }
        e();
    }

    public final void e() {
        jkw0 jkw0VarP = this.f13228a.p();
        b(jkw0VarP, this.b);
        this.b = jkw0VarP;
    }
}
