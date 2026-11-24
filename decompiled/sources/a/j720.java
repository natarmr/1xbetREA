package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j720 implements l720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16020a;

    public j720(String str) {
        this.f16020a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j720) && this.f16020a.equals(((j720) obj).f16020a);
    }

    public final int hashCode() {
        return this.f16020a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(errorMessage=", this.f16020a, Separators.RPAREN);
    }
}
