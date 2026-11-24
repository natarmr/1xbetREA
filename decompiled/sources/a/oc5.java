package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25012a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public oc5(String str, String str2, String str3, String str4, String str5) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f25012a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc5)) {
            return false;
        }
        oc5 oc5Var = (oc5) obj;
        return Intrinsics.d(this.f25012a, oc5Var.f25012a) && Intrinsics.d(this.b, oc5Var.b) && Intrinsics.d(this.c, oc5Var.c) && Intrinsics.d(this.d, oc5Var.d) && Intrinsics.d(this.e, oc5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f25012a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BackgroundImageUrlsModel(smallImageUrl=", this.f25012a, ", mediumImageUrl=", this.b, ", largeImageUrl=");
        f140.v(sbN, this.c, ", logoUrl=", this.d, ", partnersUrl=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
