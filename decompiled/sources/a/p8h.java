package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class p8h {
    public static final o8h Companion = new o8h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26553a;
    public final String b;
    public final Boolean c;
    public final Boolean d;

    public /* synthetic */ p8h(int i, String str, String str2, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f26553a = null;
        } else {
            this.f26553a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8h)) {
            return false;
        }
        p8h p8hVar = (p8h) obj;
        return Intrinsics.d(this.f26553a, p8hVar.f26553a) && Intrinsics.d(this.b, p8hVar.b) && Intrinsics.d(this.c, p8hVar.c) && Intrinsics.d(this.d, p8hVar.d);
    }

    public final int hashCode() {
        String str = this.f26553a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberMatchesStatisticBanPickResponse(heroName=", this.f26553a, ", heroImage=", this.b, ", isPick=");
        sbN.append(this.c);
        sbN.append(", isRadiant=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
