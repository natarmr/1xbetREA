package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bpa extends fpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usq f2972a;

    public bpa(usq usqVar) {
        this.f2972a = usqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpa) && this.f2972a.equals(((bpa) obj).f2972a);
    }

    public final int hashCode() {
        return this.f2972a.hashCode();
    }

    public final String toString() {
        return "TeamOneFootballEventsUiModelChange(footballEventsUiModel=" + this.f2972a + Separators.RPAREN;
    }
}
