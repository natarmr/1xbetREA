package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class m7p {
    public static final l7p Companion = new l7p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21331a;
    public final Long b;
    public final Long c;
    public final Long d;

    public /* synthetic */ m7p(int i, Long l, Long l2, Long l3, Long l4) {
        if ((i & 1) == 0) {
            this.f21331a = null;
        } else {
            this.f21331a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7p)) {
            return false;
        }
        m7p m7pVar = (m7p) obj;
        return Intrinsics.d(this.f21331a, m7pVar.f21331a) && Intrinsics.d(this.b, m7pVar.b) && Intrinsics.d(this.c, m7pVar.c) && Intrinsics.d(this.d, m7pVar.d);
    }

    public final int hashCode() {
        Long l = this.f21331a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f21331a, this.b, "FavoriteConfigurationResponse(maxCountChampionships=", ", maxCountGames=", ", maxCountTeams=");
        sbO.append(this.c);
        sbO.append(", gameStorageAfterStartSeconds=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
