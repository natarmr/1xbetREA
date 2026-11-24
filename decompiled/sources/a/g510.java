package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class g510 {
    public static final f510 Companion = new f510();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10695a;
    public final String b;

    public /* synthetic */ g510(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f10695a = null;
        } else {
            this.f10695a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g510)) {
            return false;
        }
        g510 g510Var = (g510) obj;
        return Intrinsics.d(this.f10695a, g510Var.f10695a) && Intrinsics.d(this.b, g510Var.b);
    }

    public final int hashCode() {
        String str = this.f10695a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamPlayerSpellResponse(name=", this.f10695a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
