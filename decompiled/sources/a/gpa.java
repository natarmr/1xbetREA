package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmo f11673a;

    public gpa(jmo jmoVar) {
        this.f11673a = jmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpa) && this.f11673a.equals(((gpa) obj).f11673a);
    }

    public final int hashCode() {
        return this.f11673a.hashCode();
    }

    public final String toString() {
        return "ExpandedStateChanged(btnUiModel=" + this.f11673a + Separators.RPAREN;
    }
}
