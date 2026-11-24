package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r410 {
    public static final q410 Companion = new q410();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29813a;
    public final String b;

    public /* synthetic */ r410(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f29813a = null;
        } else {
            this.f29813a = str;
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
        if (!(obj instanceof r410)) {
            return false;
        }
        r410 r410Var = (r410) obj;
        return Intrinsics.d(this.f29813a, r410Var.f29813a) && Intrinsics.d(this.b, r410Var.b);
    }

    public final int hashCode() {
        String str = this.f29813a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamPlayerItemResponse(name=", this.f29813a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
