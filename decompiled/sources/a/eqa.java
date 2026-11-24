package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class eqa extends gqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmo f8228a;

    public eqa(jmo jmoVar) {
        this.f8228a = jmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqa) && this.f8228a.equals(((eqa) obj).f8228a);
    }

    public final int hashCode() {
        return this.f8228a.hashCode();
    }

    public final String toString() {
        return "ExpandedStateChanged(btnUiModel=" + this.f8228a + Separators.RPAREN;
    }
}
