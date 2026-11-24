package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8825a;
    public final boolean b;

    public f2q(boolean z, boolean z2) {
        this.f8825a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2q)) {
            return false;
        }
        f2q f2qVar = (f2q) obj;
        return this.f8825a == f2qVar.f8825a && this.b == f2qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f8825a) * 31);
    }

    public final String toString() {
        return hne.n("SendSmsEvents(isRequired=", ", isSendSmsEvents=", Separators.RPAREN, this.f8825a, this.b);
    }
}
