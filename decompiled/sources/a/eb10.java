package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eb10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7497a;

    public eb10(mdm mdmVar) {
        this.f7497a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb10) && this.f7497a.equals(((eb10) obj).f7497a);
    }

    public final int hashCode() {
        return this.f7497a.hashCode();
    }

    public final String toString() {
        return b1j.j("RefactorToggleLottieEmptyConfigUiModel(dsEmptyConfig=", this.f7497a, Separators.RPAREN);
    }
}
