package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ol7 implements pl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25438a;
    public final on5 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ol7(String str, on5 on5Var, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f25438a = str;
        this.b = on5Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // a.pl7
    public final on5 b() {
        return this.b;
    }

    @Override // a.pl7
    public final boolean c() {
        return this.d;
    }

    @Override // a.pl7
    public final boolean d() {
        return this.c;
    }

    @Override // a.pl7
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol7)) {
            return false;
        }
        ol7 ol7Var = (ol7) obj;
        return Intrinsics.d(this.f25438a, ol7Var.f25438a) && this.b.equals(ol7Var.b) && this.c == ol7Var.c && this.d == ol7Var.d && this.e == ol7Var.e;
    }

    @Override // a.pl7
    public final String getTitle() {
        return this.f25438a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e((this.b.hashCode() + (this.f25438a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(title=");
        sb.append(this.f25438a);
        sb.append(", balanceUiState=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=");
        ua80.u(", isFullScreenLoader=", ", scrollToTop=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
