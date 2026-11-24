package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xlc0 implements dmc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wim f41066a;

    public xlc0(wim wimVar) {
        this.f41066a = wimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlc0) && this.f41066a.equals(((xlc0) obj).f41066a);
    }

    public final int hashCode() {
        return this.f41066a.hashCode();
    }

    public final String toString() {
        return "OnBonusGameCardClick(card=" + this.f41066a + Separators.RPAREN;
    }
}
