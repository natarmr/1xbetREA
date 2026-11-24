package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class yzh implements a0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43513a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;

    public yzh(String str, String str2, String str3, String str4, String str5, i4 i4Var) {
        ohs0.z(str, str2, str3, str4, str5);
        i4Var.getClass();
        this.f43513a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i4Var;
        if (i4Var.size() == 2) {
            return;
        }
        jf4.o("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzh)) {
            return false;
        }
        yzh yzhVar = (yzh) obj;
        return Intrinsics.d(this.f43513a, yzhVar.f43513a) && Intrinsics.d(this.b, yzhVar.b) && Intrinsics.d(this.c, yzhVar.c) && Intrinsics.d(this.d, yzhVar.d) && Intrinsics.d(this.e, yzhVar.e) && Intrinsics.d(this.f, yzhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(twn.a(R.drawable.ic_glyph_favourite_active, twn.a(R.drawable.ic_glyph_chevron_right_small, ua80.b(ua80.b(this.f43513a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Error(header=", this.f43513a, ", title=", this.b, ", subtitle=");
        twn.w(R.drawable.ic_glyph_chevron_right_small, this.c, ", infoIconResId=", ", levelImagePlaceholderResId=", sbN);
        kng0.w(R.drawable.ic_glyph_favourite_active, ", errorText=", this.d, ", buttonText=", sbN);
        sbN.append(this.e);
        sbN.append(", backgroundGradientColors=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
