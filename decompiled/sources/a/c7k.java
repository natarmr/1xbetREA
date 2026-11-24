package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes2.dex */
public final class c7k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkd0 f3867a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public c7k(jkd0 jkd0Var, int i, int i2) {
        g1x.q(jkd0Var, "Null dependency anInterface.");
        this.f3867a = jkd0Var;
        this.b = i;
        this.c = i2;
    }

    public static c7k a(Class cls) {
        return new c7k(0, 1, cls);
    }

    public static c7k b(jkd0 jkd0Var) {
        return new c7k(jkd0Var, 1, 0);
    }

    public static c7k c(Class cls) {
        return new c7k(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c7k)) {
            return false;
        }
        c7k c7kVar = (c7k) obj;
        return this.f3867a.equals(c7kVar.f3867a) && this.b == c7kVar.b && this.c == c7kVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.f3867a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f3867a);
        sb.append(", type=");
        byte b = this.b;
        if (b == 1) {
            str = ParameterNames.REQUIRED;
        } else {
            str = b == 0 ? ParameterNames.OPTIONAL : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        byte b2 = this.c;
        if (b2 == 0) {
            str2 = "direct";
        } else if (b2 == 1) {
            str2 = "provider";
        } else {
            if (b2 != 2) {
                c99.l(twn.m(b2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return axq.n(sb, str2, "}");
    }

    public c7k(int i, int i2, Class cls) {
        this(jkd0.a(cls), i, i2);
    }
}
