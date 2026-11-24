package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hyi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f13861a;

    public hyi0(g9 g9Var) {
        this.f13861a = g9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyi0) && this.f13861a == ((hyi0) obj).f13861a;
    }

    public final int hashCode() {
        return this.f13861a.hashCode();
    }

    public final String toString() {
        return "OnAccordionClick(group=" + this.f13861a + Separators.RPAREN;
    }
}
