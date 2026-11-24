package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p79 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3w0 f26495a;
    public final v3w0 b;
    public final boolean c;
    public final String d;

    public p79(y3w0 y3w0Var, v3w0 v3w0Var, boolean z, String str) {
        this.f26495a = y3w0Var;
        this.b = v3w0Var;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p79)) {
            return false;
        }
        p79 p79Var = (p79) obj;
        return Intrinsics.d(this.f26495a, p79Var.f26495a) && Intrinsics.d(this.b, p79Var.b) && this.c == p79Var.c && Intrinsics.d(this.d, p79Var.d);
    }

    public final int hashCode() {
        y3w0 y3w0Var = this.f26495a;
        int iHashCode = (y3w0Var == null ? 0 : y3w0Var.hashCode()) * 31;
        v3w0 v3w0Var = this.b;
        int iE = brm0.e((iHashCode + (v3w0Var == null ? 0 : v3w0Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastingZoneFullScreenUiState(zonePlayerUiModel=");
        sb.append(this.f26495a);
        sb.append(", controlPanelUiModel=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return twn.q(", errorText=", this.d, Separators.RPAREN, sb, this.c);
    }
}
