package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lha0 implements nha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jnw f20045a;

    public lha0(jnw jnwVar) {
        this.f20045a = jnwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lha0) && this.f20045a.equals(((lha0) obj).f20045a);
    }

    public final int hashCode() {
        return this.f20045a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(tennisPlayerMenuType=" + this.f20045a + Separators.RPAREN;
    }
}
