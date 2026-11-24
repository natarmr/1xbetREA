package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class j49 implements l49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f15872a;
    public final int b;
    public final i49 c;
    public final a4x d;
    public final boolean e;
    public final dxh0 f;
    public final a4x g;

    public j49(GameBroadcastingParams gameBroadcastingParams, int i, i49 i49Var, i4 i4Var, boolean z, dxh0 dxh0Var, i4 i4Var2) {
        i49Var.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f15872a = gameBroadcastingParams;
        this.b = i;
        this.c = i49Var;
        this.d = i4Var;
        this.e = z;
        this.f = dxh0Var;
        this.g = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j49)) {
            return false;
        }
        j49 j49Var = (j49) obj;
        return this.f15872a.equals(j49Var.f15872a) && this.b == j49Var.b && Intrinsics.d(this.c, j49Var.c) && Intrinsics.d(this.d, j49Var.d) && this.e == j49Var.e && this.f.equals(j49Var.f) && Intrinsics.d(this.g, j49Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + hne.h(this.f, brm0.e(cs0.b(this.d, (this.c.hashCode() + twn.a(this.b, this.f15872a.hashCode() * 31, 31)) * 31, 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(params=");
        sb.append(this.f15872a);
        sb.append(", currentIndex=");
        sb.append(this.b);
        sb.append(", currentTab=");
        sb.append(this.c);
        sb.append(", broadcastingTabs=");
        sb.append(this.d);
        sb.append(", isTabVisible=");
        sb.append(this.e);
        sb.append(", style=");
        sb.append(this.f);
        sb.append(", segments=");
        return cs0.n(sb, this.g, Separators.RPAREN);
    }
}
