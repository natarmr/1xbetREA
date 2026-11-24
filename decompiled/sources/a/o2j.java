package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o2j implements s2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24532a;
    public final long b;

    public o2j(String str, long j) {
        this.f24532a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2j)) {
            return false;
        }
        o2j o2jVar = (o2j) obj;
        return this.f24532a.equals(o2jVar.f24532a) && this.b == o2jVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f24532a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnActivateClick(screen=", this.f24532a, ", taskId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
