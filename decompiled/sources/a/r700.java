package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r700 extends u700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29957a;

    public r700(String str) {
        this.f29957a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r700) && this.f29957a.equals(((r700) obj).f29957a);
    }

    @Override // a.u700
    public final String h() {
        return this.f29957a;
    }

    public final int hashCode() {
        return this.f29957a.hashCode();
    }

    public final String toString() {
        return kng0.l("PreviousHeader(description=", this.f29957a, Separators.RPAREN);
    }
}
