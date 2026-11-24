package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ct5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4919a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ct5(int i, String str, String str2, String str3, String str4) {
        brm0.B(str, str3, str4);
        this.f4919a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct5)) {
            return false;
        }
        ct5 ct5Var = (ct5) obj;
        return this.f4919a == ct5Var.f4919a && Intrinsics.d(this.b, ct5Var.b) && this.c.equals(ct5Var.c) && Intrinsics.d(this.d, ct5Var.d) && Intrinsics.d(this.e, ct5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f4919a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f4919a, "BannerUiModel(bannerId=", ", url=", this.b, ", previewUrl=");
        f140.v(sbR, this.c, ", title=", this.d, ", description=");
        return axq.n(sbR, this.e, Separators.RPAREN);
    }
}
