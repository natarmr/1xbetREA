package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pdc0 implements wdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yrc0 f26802a;

    public pdc0(yrc0 yrc0Var) {
        this.f26802a = yrc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdc0) && this.f26802a.equals(((pdc0) obj).f26802a);
    }

    public final int hashCode() {
        return this.f26802a.hashCode();
    }

    public final String toString() {
        return "OnRecommendationClick(item=" + this.f26802a + Separators.RPAREN;
    }
}
