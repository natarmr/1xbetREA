package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class m410 {
    public static final l410 Companion = new l410();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21144a;
    public final String b;

    public /* synthetic */ m410(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21144a = null;
        } else {
            this.f21144a = str;
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
        if (!(obj instanceof m410)) {
            return false;
        }
        m410 m410Var = (m410) obj;
        return Intrinsics.d(this.f21144a, m410Var.f21144a) && Intrinsics.d(this.b, m410Var.b);
    }

    public final int hashCode() {
        String str = this.f21144a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamBanResponse(name=", this.f21144a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
