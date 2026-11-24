package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class osc0 implements qsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25777a;

    public osc0(String str) {
        this.f25777a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osc0) && this.f25777a.equals(((osc0) obj).f25777a);
    }

    public final int hashCode() {
        return this.f25777a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSuccessMessage(message=", this.f25777a, Separators.RPAREN);
    }
}
