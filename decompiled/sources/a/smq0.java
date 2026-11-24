package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class smq0 implements umq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32459a;

    public smq0(String str) {
        this.f32459a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smq0) && this.f32459a.equals(((smq0) obj).f32459a);
    }

    public final int hashCode() {
        return this.f32459a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f32459a, Separators.RPAREN);
    }
}
