package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uo00 implements wo00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35988a;
    public final String b;

    public uo00(String str, boolean z) {
        this.f35988a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo00)) {
            return false;
        }
        uo00 uo00Var = (uo00) obj;
        return this.f35988a == uo00Var.f35988a && this.b.equals(uo00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f35988a) * 31);
    }

    public final String toString() {
        return ua80.k("ResolveFailed(showProxy=", this.f35988a, ", message=", this.b, Separators.RPAREN);
    }
}
