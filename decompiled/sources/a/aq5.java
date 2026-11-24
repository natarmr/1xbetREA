package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aq5 implements bq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up5 f1281a;

    public aq5(up5 up5Var) {
        this.f1281a = up5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq5) && this.f1281a.equals(((aq5) obj).f1281a);
    }

    public final int hashCode() {
        return this.f1281a.hashCode();
    }

    public final String toString() {
        return "Shimmers(value=" + this.f1281a + Separators.RPAREN;
    }
}
