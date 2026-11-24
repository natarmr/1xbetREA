package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class l81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19586a;

    public l81(String str) {
        this.f19586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l81) && this.f19586a.equals(((l81) obj).f19586a);
    }

    public final int hashCode() {
        return this.f19586a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNicknameError(description=", this.f19586a, Separators.RPAREN);
    }
}
