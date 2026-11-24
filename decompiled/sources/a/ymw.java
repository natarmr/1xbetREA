package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ymw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42911a;
    public final jnw b;

    public ymw(String str, jnw jnwVar) {
        this.f42911a = str;
        this.b = jnwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymw)) {
            return false;
        }
        ymw ymwVar = (ymw) obj;
        return this.f42911a.equals(ymwVar.f42911a) && this.b.equals(ymwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42911a.hashCode() * 31);
    }

    public final String toString() {
        return "HorseMenuItemStateModel(title=" + this.f42911a + ", horseMenuType=" + this.b + Separators.RPAREN;
    }
}
