package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gs9 implements ks9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11818a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final wui0 g;

    public gs9(long j, long j2, long j3, String str, String str2, boolean z, wui0 wui0Var) {
        str.getClass();
        this.f11818a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs9)) {
            return false;
        }
        gs9 gs9Var = (gs9) obj;
        if (this.f11818a != gs9Var.f11818a) {
            return false;
        }
        long j = gs9Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, gs9Var.c) && Intrinsics.d(this.d, gs9Var.d) && this.e.equals(gs9Var.e) && this.f == gs9Var.f && this.g == gs9Var.g;
    }

    public final int hashCode() {
        int iA = twn.a(R.drawable.ic_glyph_call_back, Long.hashCode(this.f11818a) * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.g.hashCode() + brm0.e(ua80.b(ua80.b(rw2.b(rw2.b(iA, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        StringBuilder sbQ = brm0.q(R.drawable.ic_glyph_call_back, this.f11818a, "EvaluateButton(itemId=", ", iconRes=");
        f140.v(sbQ, ", iconTint=", strI, ", iconBackgroundTint=", strI2);
        f140.v(sbQ, ", title=", this.d, ", subtitle=", this.e);
        sbQ.append(", animatedItem=");
        sbQ.append(this.f);
        sbQ.append(", position=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
