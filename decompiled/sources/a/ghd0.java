package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ghd0 implements khd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11292a;

    public ghd0(String str) {
        this.f11292a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghd0) && this.f11292a.equals(((ghd0) obj).f11292a);
    }

    public final int hashCode() {
        return this.f11292a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f11292a, Separators.RPAREN);
    }
}
