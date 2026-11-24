package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class skr implements ukr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32366a;

    public skr(String str) {
        this.f32366a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skr) && this.f32366a.equals(((skr) obj).f32366a);
    }

    public final int hashCode() {
        return this.f32366a.hashCode();
    }

    public final String toString() {
        return kng0.l("TestSendSuccessfuly(message=", this.f32366a, Separators.RPAREN);
    }
}
