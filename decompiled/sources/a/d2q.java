package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5369a;
    public final boolean b;

    public d2q(boolean z, boolean z2) {
        this.f5369a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2q)) {
            return false;
        }
        d2q d2qVar = (d2q) obj;
        return this.f5369a == d2qVar.f5369a && this.b == d2qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f5369a) * 31);
    }

    public final String toString() {
        return hne.n("SendEmailBets(isRequired=", ", isSendEmailBets=", Separators.RPAREN, this.f5369a, this.b);
    }
}
