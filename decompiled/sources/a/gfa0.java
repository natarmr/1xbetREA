package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gfa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11199a;
    public final String b;
    public final String c;

    public gfa0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f11199a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfa0)) {
            return false;
        }
        gfa0 gfa0Var = (gfa0) obj;
        return Intrinsics.d(this.f11199a, gfa0Var.f11199a) && this.b.equals(gfa0Var.b) && Intrinsics.d(this.c, gfa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f11199a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PlayersCompositionTeamInfoUiModel(teamName=", this.f11199a, ", teamImage=", this.b, ", teamRating="), this.c, Separators.RPAREN);
    }
}
