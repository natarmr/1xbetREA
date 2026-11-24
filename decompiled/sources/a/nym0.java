package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24336a;

    public nym0(String str) {
        this.f24336a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nym0) && this.f24336a.equals(((nym0) obj).f24336a);
    }

    public final int hashCode() {
        return this.f24336a.hashCode();
    }

    public final String toString() {
        return kng0.l("SubGamesSearchUiModel(query=", this.f24336a, Separators.RPAREN);
    }
}
