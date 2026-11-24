package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k510 {
    public static final j510 Companion = new j510();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17697a;
    public final String b;

    public /* synthetic */ k510(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f17697a = null;
        } else {
            this.f17697a = str;
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
        if (!(obj instanceof k510)) {
            return false;
        }
        k510 k510Var = (k510) obj;
        return Intrinsics.d(this.f17697a, k510Var.f17697a) && Intrinsics.d(this.b, k510Var.b);
    }

    public final int hashCode() {
        String str = this.f17697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamPlayerTrinketResponse(name=", this.f17697a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
