package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jcj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vvi0 f16280a;

    public jcj0(vvi0 vvi0Var) {
        this.f16280a = vvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcj0) && this.f16280a == ((jcj0) obj).f16280a;
    }

    public final int hashCode() {
        return this.f16280a.hashCode();
    }

    public final String toString() {
        return "ShowNeedAuthSnackBar(settingDestinationType=" + this.f16280a + Separators.RPAREN;
    }
}
