package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r2j implements s2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29736a;
    public final String b;

    public r2j(String str, String str2) {
        this.f29736a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2j)) {
            return false;
        }
        r2j r2jVar = (r2j) obj;
        return this.f29736a.equals(r2jVar.f29736a) && this.b.equals(r2jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29736a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnWidgetClick(screen=", this.f29736a, ", option=", this.b, Separators.RPAREN);
    }
}
