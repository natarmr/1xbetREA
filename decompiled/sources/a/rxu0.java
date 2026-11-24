package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31283a;

    public rxu0(String str) {
        this.f31283a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxu0) && this.f31283a.equals(((rxu0) obj).f31283a);
    }

    public final int hashCode() {
        return this.f31283a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSuccessPayOutDialog(message=", this.f31283a, Separators.RPAREN);
    }
}
