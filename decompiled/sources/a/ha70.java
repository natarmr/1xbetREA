package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ha70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12712a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ha70(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f12712a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha70)) {
            return false;
        }
        ha70 ha70Var = (ha70) obj;
        return this.f12712a == ha70Var.f12712a && this.b == ha70Var.b && this.c == ha70Var.c && this.d == ha70Var.d && this.e == ha70Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f12712a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OneXGamesWebGameLoadingState(webViewInitialized=", ", gameInitialized=", ", pageReady=", this.f12712a, this.b);
        ua80.u(", connected=", ", restartDialogVisible=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
