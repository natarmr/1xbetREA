package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class huh implements juh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lvh f13679a;

    public final boolean equals(Object obj) {
        if (obj instanceof huh) {
            return this.f13679a.equals(((huh) obj).f13679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13679a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(menuType=" + this.f13679a + Separators.RPAREN;
    }
}
