package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nmw implements rmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jnw f23792a;

    public nmw(jnw jnwVar) {
        this.f23792a = jnwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmw) && this.f23792a.equals(((nmw) obj).f23792a);
    }

    public final int hashCode() {
        return this.f23792a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(menuType=" + this.f23792a + Separators.RPAREN;
    }
}
