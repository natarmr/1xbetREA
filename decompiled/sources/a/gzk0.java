package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gzk0 {
    public static final gzk0 c = new gzk0(c8h0.c, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8h0 f12183a;
    public final String b;

    public gzk0(c8h0 c8h0Var, String str) {
        c8h0Var.getClass();
        this.f12183a = c8h0Var;
        this.b = str;
    }

    public static gzk0 a(gzk0 gzk0Var) {
        c8h0 c8h0Var = c8h0.c;
        String str = gzk0Var.b;
        gzk0Var.getClass();
        return new gzk0(c8h0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzk0)) {
            return false;
        }
        gzk0 gzk0Var = (gzk0) obj;
        return this.f12183a == gzk0Var.f12183a && this.b.equals(gzk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12183a.hashCode() * 31);
    }

    public final String toString() {
        return "SpinButtonState(screenSource=" + this.f12183a + ", spinText=" + this.b + Separators.RPAREN;
    }
}
