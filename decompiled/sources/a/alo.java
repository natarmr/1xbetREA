package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class alo {
    public static final alo b = new alo(new jms0((fwo) null, (e8k0) null, (isb) null, (k1h0) null, (LinkedHashMap) null, 127));
    public static final alo c = new alo(new jms0((fwo) null, (e8k0) null, (isb) null, (k1h0) null, (LinkedHashMap) null, 95));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jms0 f1078a;

    public alo(jms0 jms0Var) {
        this.f1078a = jms0Var;
    }

    public final alo a(alo aloVar) {
        jms0 jms0Var = aloVar.f1078a;
        fwo fwoVar = jms0Var.f16780a;
        jms0 jms0Var2 = this.f1078a;
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
        return new alo(new jms0(fwoVar, e8k0Var, isbVar, k1h0Var, jms0Var.e || jms0Var2.e, xp20.j(jms0Var2.f, jms0Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof alo) && ((alo) obj).f1078a.equals(this.f1078a);
    }

    public final int hashCode() {
        return this.f1078a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        jms0 jms0Var = this.f1078a;
        fwo fwoVar = jms0Var.f16780a;
        String string = fwoVar != null ? fwoVar.toString() : null;
        e8k0 e8k0Var = jms0Var.b;
        String string2 = e8k0Var != null ? e8k0Var.toString() : null;
        isb isbVar = jms0Var.c;
        String string3 = isbVar != null ? isbVar.toString() : null;
        k1h0 k1h0Var = jms0Var.d;
        String string4 = k1h0Var != null ? k1h0Var.toString() : null;
        boolean z = jms0Var.e;
        StringBuilder sbN = b1j.n("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        f140.v(sbN, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbN.append(z);
        return sbN.toString();
    }
}
