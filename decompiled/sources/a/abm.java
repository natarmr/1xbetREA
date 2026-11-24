package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class abm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f586a;
    public final yam b;

    public abm(Double d, yam yamVar) {
        this.f586a = d;
        this.b = yamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abm)) {
            return false;
        }
        abm abmVar = (abm) obj;
        return Intrinsics.d(this.f586a, abmVar.f586a) && this.b == abmVar.b;
    }

    public final int hashCode() {
        Double d = this.f586a;
        return this.b.hashCode() + ((d == null ? 0 : d.hashCode()) * 31);
    }

    public final String toString() {
        return "DsCyberTeamLineupInfoComparableValueUiModel(value=" + this.f586a + ", valueStyle=" + this.b + Separators.RPAREN;
    }
}
