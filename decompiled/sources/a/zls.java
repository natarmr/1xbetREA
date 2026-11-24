package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zls implements bms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44596a;
    public final boolean b;

    public zls(String str, boolean z) {
        this.f44596a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zls)) {
            return false;
        }
        zls zlsVar = (zls) obj;
        return this.f44596a.equals(zlsVar.f44596a) && this.b == zlsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44596a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Content(text=", this.f44596a, ", expanded=", this.b, Separators.RPAREN);
    }
}
