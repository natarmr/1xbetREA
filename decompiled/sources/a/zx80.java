package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45146a;
    public final String b;
    public final String c;
    public final String d;

    public zx80(String str, String str2, String str3, String str4) {
        brm0.B(str, str2, str3);
        this.f45146a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx80)) {
            return false;
        }
        zx80 zx80Var = (zx80) obj;
        return Intrinsics.d(this.f45146a, zx80Var.f45146a) && Intrinsics.d(this.b, zx80Var.b) && Intrinsics.d(this.c, zx80Var.c) && this.d.equals(zx80Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_circle_globe) + ua80.b(ua80.b(ua80.b(this.f45146a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PartnersCardItemUiModel(id=", this.f45146a, ", teamId=", this.b, ", teamName=");
        f140.v(sbN, this.c, ", imageLink=", this.d, ", placeholderResId=");
        return rz4.j(R.drawable.ic_glyph_circle_globe, Separators.RPAREN, sbN);
    }
}
