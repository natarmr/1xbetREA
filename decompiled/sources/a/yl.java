package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class yl {
    public static final wl Companion = new wl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f42816a;
    public final String b;
    public final String c;

    public /* synthetic */ yl(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f42816a = null;
        } else {
            this.f42816a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl)) {
            return false;
        }
        yl ylVar = (yl) obj;
        return Intrinsics.d(this.f42816a, ylVar.f42816a) && Intrinsics.d(this.b, ylVar.b) && Intrinsics.d(this.c, ylVar.c);
    }

    public final int hashCode() {
        Long l = this.f42816a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f42816a, "ActiveLimitValueResponse(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
