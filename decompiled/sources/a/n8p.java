package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n8p {
    public static final m8p Companion = new m8p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23102a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final Long f;

    public /* synthetic */ n8p(int i, Long l, Long l2, Long l3, String str, String str2, Long l4) {
        if ((i & 1) == 0) {
            this.f23102a = null;
        } else {
            this.f23102a = l;
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
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8p)) {
            return false;
        }
        n8p n8pVar = (n8p) obj;
        return Intrinsics.d(this.f23102a, n8pVar.f23102a) && Intrinsics.d(this.b, n8pVar.b) && Intrinsics.d(this.c, n8pVar.c) && Intrinsics.d(this.d, n8pVar.d) && Intrinsics.d(this.e, n8pVar.e) && Intrinsics.d(this.f, n8pVar.f);
    }

    public final int hashCode() {
        Long l = this.f23102a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.f;
        return iHashCode5 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f23102a, this.b, "FavoriteGameResponse(mainConstId=", ", mainGameId=", ", sportId=");
        rz4.v(this.c, ", sportName=", this.d, ", statId=", sbO);
        sbO.append(this.e);
        sbO.append(", dateStart=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
