package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kst0 {
    public static final jst0 Companion = new jst0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18833a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ kst0(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f18833a = null;
        } else {
            this.f18833a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kst0)) {
            return false;
        }
        kst0 kst0Var = (kst0) obj;
        return Intrinsics.d(this.f18833a, kst0Var.f18833a) && Intrinsics.d(this.b, kst0Var.b) && Intrinsics.d(this.c, kst0Var.c) && Intrinsics.d(this.d, kst0Var.d) && Intrinsics.d(this.e, kst0Var.e);
    }

    public final int hashCode() {
        String str = this.f18833a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UserResponse(id=", this.f18833a, ", publicId=", this.b, ", type=");
        f140.v(sbN, this.c, ", name=", this.d, ", avatarLink=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
