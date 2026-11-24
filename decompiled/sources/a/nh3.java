package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbk0 f23514a;
    public final ig3 b;

    public nh3(hbk0 hbk0Var, ig3 ig3Var) {
        this.f23514a = hbk0Var;
        this.b = ig3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh3)) {
            return false;
        }
        nh3 nh3Var = (nh3) obj;
        return this.f23514a.equals(nh3Var.f23514a) && this.b.equals(nh3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23514a.hashCode() * 31);
    }

    public final String toString() {
        return "AppStartUiModel(background=" + this.f23514a + ", content=" + this.b + Separators.RPAREN;
    }
}
