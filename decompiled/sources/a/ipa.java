package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ipa extends kpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmo f15152a;

    public ipa(jmo jmoVar) {
        this.f15152a = jmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipa) && this.f15152a.equals(((ipa) obj).f15152a);
    }

    public final int hashCode() {
        return this.f15152a.hashCode();
    }

    public final String toString() {
        return "ExpandedStateChanged(btnUiModel=" + this.f15152a + Separators.RPAREN;
    }
}
