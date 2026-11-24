package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class urq0 {
    public static final trq0 Companion = new trq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36177a;
    public final Boolean b;
    public final String c;
    public final Long d;
    public final Long e;

    public /* synthetic */ urq0(int i, Boolean bool, Long l, Long l2, Long l3, String str) {
        if ((i & 1) == 0) {
            this.f36177a = null;
        } else {
            this.f36177a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urq0)) {
            return false;
        }
        urq0 urq0Var = (urq0) obj;
        return Intrinsics.d(this.f36177a, urq0Var.f36177a) && Intrinsics.d(this.b, urq0Var.b) && Intrinsics.d(this.c, urq0Var.c) && Intrinsics.d(this.d, urq0Var.d) && Intrinsics.d(this.e, urq0Var.e);
    }

    public final int hashCode() {
        Long l = this.f36177a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        return iHashCode4 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleRatingValueColResponse(id=");
        sb.append(this.f36177a);
        sb.append(", isOffset=");
        sb.append(this.b);
        sb.append(", title=");
        h97.w(this.d, this.c, ", rowSpan=", ", colSpan=", sb);
        return ohs0.r(sb, this.e, Separators.RPAREN);
    }
}
