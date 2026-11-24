package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l6j implements m6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6j f19508a;
    public final boolean b;

    public l6j(y6j y6jVar, boolean z) {
        y6jVar.getClass();
        this.f19508a = y6jVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6j)) {
            return false;
        }
        l6j l6jVar = (l6j) obj;
        return Intrinsics.d(this.f19508a, l6jVar.f19508a) && this.b == l6jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f19508a.hashCode() * 31);
    }

    public final String toString() {
        return "SetCurrentRanking(dailyTournamentUserPlaceModel=" + this.f19508a + ", showResult=" + this.b + Separators.RPAREN;
    }
}
