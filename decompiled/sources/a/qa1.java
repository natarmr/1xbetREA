package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qa1 implements ya1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28374a;
    public final boolean b;

    public qa1(boolean z, boolean z2) {
        this.f28374a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa1)) {
            return false;
        }
        qa1 qa1Var = (qa1) obj;
        return this.f28374a == qa1Var.f28374a && this.b == qa1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f28374a) * 31);
    }

    public final String toString() {
        return hne.n("ConversionResult(dontShowAgain=", ", complete=", Separators.RPAREN, this.f28374a, this.b);
    }
}
