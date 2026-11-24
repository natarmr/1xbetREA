package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s3i extends u3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8 f31559a;

    public s3i(r8 r8Var) {
        this.f31559a = r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3i) && this.f31559a == ((s3i) obj).f31559a;
    }

    public final int hashCode() {
        return this.f31559a.hashCode();
    }

    public final String toString() {
        return "Available(buttonState=" + this.f31559a + Separators.RPAREN;
    }
}
