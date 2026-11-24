package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ydf {
    public static final xdf Companion = new xdf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f42433a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ydf(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f42433a = null;
        } else {
            this.f42433a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydf)) {
            return false;
        }
        ydf ydfVar = (ydf) obj;
        return Intrinsics.d(this.f42433a, ydfVar.f42433a) && Intrinsics.d(this.b, ydfVar.b) && Intrinsics.d(this.c, ydfVar.c) && Intrinsics.d(this.d, ydfVar.d) && Intrinsics.d(this.e, ydfVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.f42433a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CriticalConfigDto(hasSectionToto=");
        sb.append(this.f42433a);
        sb.append(", hasBetConstructor=");
        sb.append(this.b);
        sb.append(", hasFinancial=");
        defpackage.c.j(sb, this.c, ", hasSectionXGames=", this.d, ", hasSectionAggregator=");
        return defpackage.c.e(sb, this.e, Separators.RPAREN);
    }
}
