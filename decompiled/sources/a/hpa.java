package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmo f13431a;

    public hpa(jmo jmoVar) {
        this.f13431a = jmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpa) && this.f13431a.equals(((hpa) obj).f13431a);
    }

    public final int hashCode() {
        return this.f13431a.hashCode();
    }

    public final String toString() {
        return "ExpandedStateChanged(btnUiModel=" + this.f13431a + Separators.RPAREN;
    }
}
