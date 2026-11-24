package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class v81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd50 f36958a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final ax0 i;

    public v81(bd50 bd50Var, String str, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, ax0 ax0Var) {
        str3.getClass();
        this.f36958a = bd50Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = str3;
        this.h = z4;
        this.i = ax0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v81)) {
            return false;
        }
        v81 v81Var = (v81) obj;
        return this.f36958a.equals(v81Var.f36958a) && Intrinsics.d(this.b, v81Var.b) && this.c == v81Var.c && this.d == v81Var.d && this.e == v81Var.e && this.f.equals(v81Var.f) && Intrinsics.d(this.g, v81Var.g) && this.h == v81Var.h && this.i.equals(v81Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.f36958a.hashCode() * 31;
        String str = this.b;
        return this.i.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorMultiModeGameUiState(navigationBarUiModel=");
        sb.append(this.f36958a);
        sb.append(", taxLabel=");
        sb.append(this.b);
        sb.append(", isLoading=");
        ua80.u(", isDemo=", ", fullScreenEnabled=", sb, this.c, this.d);
        f140.s(", gameUrl=", this.f, ", lobbyUrl=", sb, this.e);
        brm0.C(this.g, ", debugAllowed=", ", aggregatorGameWebViewState=", sb, this.h);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
