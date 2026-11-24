package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n570 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r270 f22930a;
    public final long b;
    public final int c;
    public final String d;

    public n570(r270 r270Var, long j, int i, String str) {
        str.getClass();
        this.f22930a = r270Var;
        this.b = j;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n570)) {
            return false;
        }
        n570 n570Var = (n570) obj;
        return this.f22930a == n570Var.f22930a && this.b == n570Var.b && this.c == n570Var.c && Intrinsics.d(this.d, n570Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, rw2.b(this.f22930a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchTab(tab=");
        sb.append(this.f22930a);
        sb.append(", gameId=");
        sb.append(this.b);
        w6x.w(this.c, ", promoTypeId=", ", webGameSessionId=", this.d, sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
