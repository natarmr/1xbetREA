package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ol8 implements rl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25439a;
    public final boolean b;

    public ol8(boolean z, boolean z2) {
        this.f25439a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol8)) {
            return false;
        }
        ol8 ol8Var = (ol8) obj;
        return this.f25439a == ol8Var.f25439a && this.b == ol8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f25439a) * 31);
    }

    public final String toString() {
        return hne.n("Claim(isLoading=", ", isEnable=", Separators.RPAREN, this.f25439a, this.b);
    }
}
