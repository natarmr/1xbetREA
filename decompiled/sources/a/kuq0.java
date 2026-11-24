package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kuq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18924a;

    public kuq0(boolean z) {
        this.f18924a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuq0) && this.f18924a == ((kuq0) obj).f18924a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18924a);
    }

    public final String toString() {
        return defpackage.c.d("ShowParsingNumberCoefficientsModel(enable=", Separators.RPAREN, this.f18924a);
    }
}
