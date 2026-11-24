package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rr9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30971a;
    public final long b;

    public rr9(long j, long j2) {
        this.f30971a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr9)) {
            return false;
        }
        rr9 rr9Var = (rr9) obj;
        long j = rr9Var.f30971a;
        int i = y3d.h;
        return h2t0.a(this.f30971a, j) && h2t0.a(this.b, rr9Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(R.drawable.ic_glyph_call_back) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + rw2.b(iHashCode, 31, this.f30971a);
    }

    public final String toString() {
        String strI = y3d.i(this.f30971a);
        return axq.n(vqd.r(R.drawable.ic_glyph_call_back, "CallbackHistorySettingsLeftStyle(iconResId=", ", imageTintColor=", strI, ", backgroundTint="), y3d.i(this.b), Separators.RPAREN);
    }
}
