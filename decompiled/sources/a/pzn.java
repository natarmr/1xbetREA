package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pzn {
    public static final pzn b = new pzn(new jms0((fwo) null, (e8k0) null, (isb) null, (k1h0) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jms0 f27854a;

    public pzn(jms0 jms0Var) {
        this.f27854a = jms0Var;
    }

    public final pzn a(pzn pznVar) {
        jms0 jms0Var = pznVar.f27854a;
        fwo fwoVar = jms0Var.f16780a;
        jms0 jms0Var2 = this.f27854a;
        if (fwoVar == null) {
            fwoVar = jms0Var2.f16780a;
        }
        e8k0 e8k0Var = jms0Var.b;
        if (e8k0Var == null) {
            e8k0Var = jms0Var2.b;
        }
        isb isbVar = jms0Var.c;
        if (isbVar == null) {
            isbVar = jms0Var2.c;
        }
        k1h0 k1h0Var = jms0Var.d;
        if (k1h0Var == null) {
            k1h0Var = jms0Var2.d;
        }
        return new pzn(new jms0(fwoVar, e8k0Var, isbVar, k1h0Var, xp20.j(jms0Var2.f, jms0Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pzn) && ((pzn) obj).f27854a.equals(this.f27854a);
    }

    public final int hashCode() {
        return this.f27854a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        jms0 jms0Var = this.f27854a;
        fwo fwoVar = jms0Var.f16780a;
        String string = fwoVar != null ? fwoVar.toString() : null;
        e8k0 e8k0Var = jms0Var.b;
        String string2 = e8k0Var != null ? e8k0Var.toString() : null;
        isb isbVar = jms0Var.c;
        String string3 = isbVar != null ? isbVar.toString() : null;
        k1h0 k1h0Var = jms0Var.d;
        return ua80.m(b1j.n("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", k1h0Var != null ? k1h0Var.toString() : null, ", Veil - null");
    }
}
