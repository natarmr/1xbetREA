package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tc3 implements uc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33700a;

    public tc3(String str) {
        this.f33700a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc3) && this.f33700a.equals(((tc3) obj).f33700a);
    }

    public final int hashCode() {
        return this.f33700a.hashCode();
    }

    public final String toString() {
        return kng0.l("Show(imageUrl=", this.f33700a, Separators.RPAREN);
    }
}
