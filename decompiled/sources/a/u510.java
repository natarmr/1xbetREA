package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class u510 {
    public static final t510 Companion = new t510();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35074a;
    public final Long b;
    public final String c;
    public final String d;

    public /* synthetic */ u510(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f35074a = null;
        } else {
            this.f35074a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u510)) {
            return false;
        }
        u510 u510Var = (u510) obj;
        return Intrinsics.d(this.f35074a, u510Var.f35074a) && Intrinsics.d(this.b, u510Var.b) && Intrinsics.d(this.c, u510Var.c) && Intrinsics.d(this.d, u510Var.d);
    }

    public final int hashCode() {
        Integer num = this.f35074a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(h97.m(this.f35074a, this.b, "LolStatisticMatchesTeamResponse(id=", ", feedId=", ", name="), this.c, ", image=", this.d, Separators.RPAREN);
    }
}
