package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class hfa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12964a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;

    public hfa0(long j, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        this.f12964a = str;
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
        if (!(obj instanceof hfa0)) {
            return false;
        }
        hfa0 hfa0Var = (hfa0) obj;
        if (!Intrinsics.d(this.f12964a, hfa0Var.f12964a) || !this.b.equals(hfa0Var.b) || !this.c.equals(hfa0Var.c) || !this.d.equals(hfa0Var.d) || this.e != hfa0Var.e) {
            return false;
        }
        long j = hfa0Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(R.drawable.cyber_composition_player_placeholder, ua80.b(ua80.b(ua80.b(this.f12964a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + iE;
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbN = b1j.n("PlayersCompositionTeamPlayerUiModel(playerId=", this.f12964a, ", playerName=", this.b, ", imageFlag=");
        f140.v(sbN, this.c, ", playerImage=", this.d, ", playerPlaceholder=");
        brm0.w(R.drawable.cyber_composition_player_placeholder, ", selected=", ", playerBackgroundColor=", sbN, this.e);
        return axq.n(sbN, strI, Separators.RPAREN);
    }
}
