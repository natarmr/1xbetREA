package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class go90 implements ho90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq90 f11620a;

    public final boolean equals(Object obj) {
        if (obj instanceof go90) {
            return this.f11620a.equals(((go90) obj).f11620a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11620a.hashCode();
    }

    public final String toString() {
        return "OnSelect(model=" + this.f11620a + Separators.RPAREN;
    }
}
