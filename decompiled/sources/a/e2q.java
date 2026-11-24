package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7098a;
    public final boolean b;

    public e2q(boolean z, boolean z2) {
        this.f7098a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2q)) {
            return false;
        }
        e2q e2qVar = (e2q) obj;
        return this.f7098a == e2qVar.f7098a && this.b == e2qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f7098a) * 31);
    }

    public final String toString() {
        return hne.n("SendEmailNews(isRequired=", ", isSendEmailNews=", Separators.RPAREN, this.f7098a, this.b);
    }
}
