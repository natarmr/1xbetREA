package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class euq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8435a;

    public euq0(boolean z) {
        this.f8435a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euq0) && this.f8435a == ((euq0) obj).f8435a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8435a);
    }

    public final String toString() {
        return defpackage.c.d("InternetEmulationModel(enable=", Separators.RPAREN, this.f8435a);
    }
}
