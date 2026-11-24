package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u7p implements y7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35195a;
    public final String b;

    public u7p(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f35195a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7p)) {
            return false;
        }
        u7p u7pVar = (u7p) obj;
        return Intrinsics.d(this.f35195a, u7pVar.f35195a) && Intrinsics.d(this.b, u7pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35195a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("MultiTeams(firstTeamLabel=", this.f35195a, ", secondTeamLabel=", this.b, Separators.RPAREN);
    }
}
