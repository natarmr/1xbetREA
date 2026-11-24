package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dpa extends fpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usq f6455a;

    public dpa(usq usqVar) {
        this.f6455a = usqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpa) && this.f6455a.equals(((dpa) obj).f6455a);
    }

    public final int hashCode() {
        return this.f6455a.hashCode();
    }

    public final String toString() {
        return "TeamTwoFootballEventsUiModelChange(footballEventsUiModel=" + this.f6455a + Separators.RPAREN;
    }
}
