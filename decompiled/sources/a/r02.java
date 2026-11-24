package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class r02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29607a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;

    public r02(long j, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        this.f29607a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r02)) {
            return false;
        }
        r02 r02Var = (r02) obj;
        if (!Intrinsics.d(this.f29607a, r02Var.f29607a) || !this.b.equals(r02Var.b) || !this.c.equals(r02Var.c) || !this.d.equals(r02Var.d) || this.e != r02Var.e) {
            return false;
        }
        long j = r02Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(R.drawable.cyber_composition_player_placeholder, ua80.b(ua80.b(ua80.b(this.f29607a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + iE;
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbN = b1j.n("AimPlayersPlayerUiModel(id=", this.f29607a, ", name=", this.b, ", image=");
        f140.v(sbN, this.c, ", flagImage=", this.d, ", placeholderResId=");
        brm0.w(R.drawable.cyber_composition_player_placeholder, ", selected=", ", backgroundColor=", sbN, this.e);
        return axq.n(sbN, strI, Separators.RPAREN);
    }
}
