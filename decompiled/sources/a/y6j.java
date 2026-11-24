package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42099a;
    public final String b;
    public final long c;

    public y6j(float f, long j, String str) {
        this.f42099a = f;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6j)) {
            return false;
        }
        y6j y6jVar = (y6j) obj;
        return Float.compare(this.f42099a, y6jVar.f42099a) == 0 && this.b.equals(y6jVar.b) && this.c == y6jVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(Float.hashCode(this.f42099a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyTournamentUserPlaceModel(points=");
        sb.append(this.f42099a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", place=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
