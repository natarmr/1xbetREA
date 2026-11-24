package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yl30 {
    public static final jl30 Companion = new jl30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42821a;
    public final String b;
    public final Long c;
    public final String d;
    public final List e;
    public final List f;

    public /* synthetic */ yl30(int i, String str, String str2, Long l, String str3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f42821a = null;
        } else {
            this.f42821a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl30)) {
            return false;
        }
        yl30 yl30Var = (yl30) obj;
        return Intrinsics.d(this.f42821a, yl30Var.f42821a) && Intrinsics.d(this.b, yl30Var.b) && Intrinsics.d(this.c, yl30Var.c) && Intrinsics.d(this.d, yl30Var.d) && Intrinsics.d(this.e, yl30Var.e) && Intrinsics.d(this.f, yl30Var.f);
    }

    public final int hashCode() {
        String str = this.f42821a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Media(type=", this.f42821a, ", id=", this.b, ", size=");
        rz4.v(this.c, ", mimeType=", this.d, ", thumbs=", sbN);
        return kng0.n(", attributes=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
