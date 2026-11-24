package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rhw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30508a;
    public final String b;

    public rhw(int i, String str) {
        this.f30508a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhw)) {
            return false;
        }
        rhw rhwVar = (rhw) obj;
        return this.f30508a == rhwVar.f30508a && this.b.equals(rhwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f30508a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f30508a, "OnSpecialEventClick(id=", ", name=", this.b, Separators.RPAREN);
    }
}
