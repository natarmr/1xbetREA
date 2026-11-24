package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f13839a;
    public final int b;

    public hy00(ox oxVar, int i) {
        this.f13839a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy00)) {
            return false;
        }
        hy00 hy00Var = (hy00) obj;
        return this.f13839a.equals(hy00Var.f13839a) && this.b == hy00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f13839a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAdditionalInfoClick(action=" + this.f13839a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
