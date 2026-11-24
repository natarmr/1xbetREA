package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oxr0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26027a;

    public oxr0(int i) {
        this.f26027a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxr0) && this.f26027a == ((oxr0) obj).f26027a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26027a);
    }

    public final String toString() {
        return ua80.e(this.f26027a, "TournamentBracketSwissArrowUiModel(image=", Separators.RPAREN);
    }
}
