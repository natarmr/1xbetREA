package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40031a;
    public final hzo0 b;

    public wzo0(boolean z, hzo0 hzo0Var) {
        this.f40031a = z;
        this.b = hzo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzo0)) {
            return false;
        }
        wzo0 wzo0Var = (wzo0) obj;
        return this.f40031a == wzo0Var.f40031a && this.b.equals(wzo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f40031a) * 31);
    }

    public final String toString() {
        return "TeamBetEventsUiState(isRefreshing=" + this.f40031a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
