package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class p61 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26430a;
    public final boolean b;

    public p61(boolean z, boolean z2) {
        this.f26430a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p61)) {
            return false;
        }
        p61 p61Var = (p61) obj;
        return this.f26430a == p61Var.f26430a && this.b == p61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f26430a) * 31);
    }

    public final String toString() {
        return hne.n("ConversionResult(dontShowAgain=", ", complete=", Separators.RPAREN, this.f26430a, this.b);
    }
}
