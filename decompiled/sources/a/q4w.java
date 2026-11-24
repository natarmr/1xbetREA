package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q4w implements s4w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28121a;

    public q4w(String str) {
        this.f28121a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4w) && this.f28121a.equals(((q4w) obj).f28121a);
    }

    public final int hashCode() {
        return this.f28121a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSingleBetHidden(subTitle=", this.f28121a, Separators.RPAREN);
    }
}
