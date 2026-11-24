package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12723a;
    public final String b;

    public hag(String str, String str2) {
        this.f12723a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hag)) {
            return false;
        }
        hag hagVar = (hag) obj;
        return this.f12723a.equals(hagVar.f12723a) && this.b.equals(hagVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12723a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CyberCalendarTeamModel(name=", this.f12723a, ", image=", this.b, Separators.RPAREN);
    }
}
