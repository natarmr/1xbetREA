package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fs9 implements ks9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10055a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final wui0 f;
    public final int g;

    public fs9(int i, long j, long j2, long j3, wui0 wui0Var, String str, String str2) {
        str.getClass();
        this.f10055a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = wui0Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs9)) {
            return false;
        }
        fs9 fs9Var = (fs9) obj;
        if (this.f10055a != fs9Var.f10055a) {
            return false;
        }
        long j = fs9Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, fs9Var.c) && Intrinsics.d(this.d, fs9Var.d) && this.e.equals(fs9Var.e) && this.f == fs9Var.f && this.g == fs9Var.g;
    }

    public final int hashCode() {
        int iA = twn.a(R.drawable.ic_glyph_call_back, Long.hashCode(this.f10055a) * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Integer.hashCode(this.g) + rw2.c(this.f, ua80.b(ua80.b(rw2.b(rw2.b(iA, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        StringBuilder sbQ = brm0.q(R.drawable.ic_glyph_call_back, this.f10055a, "AssessedStars(itemId=", ", iconRes=");
        f140.v(sbQ, ", iconTint=", strI, ", iconBackgroundTint=", strI2);
        f140.v(sbQ, ", title=", this.d, ", subtitle=", this.e);
        sbQ.append(", position=");
        sbQ.append(this.f);
        sbQ.append(", rating=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
