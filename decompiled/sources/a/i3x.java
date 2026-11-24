package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class i3x {
    public static final h3x Companion = new h3x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14119a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ i3x(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f14119a = null;
        } else {
            this.f14119a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3x)) {
            return false;
        }
        i3x i3xVar = (i3x) obj;
        return Intrinsics.d(this.f14119a, i3xVar.f14119a) && Intrinsics.d(this.b, i3xVar.b) && Intrinsics.d(this.c, i3xVar.c) && Intrinsics.d(this.d, i3xVar.d);
    }

    public final int hashCode() {
        String str = this.f14119a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("ImagesResponse(backgroundImage=", this.f14119a, ", backgroundIpadImage=", this.b, ", masterImage="), this.c, ", masterTabletImage=", this.d, Separators.RPAREN);
    }
}
