package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kkc0 implements mkc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18430a;

    public kkc0(int i) {
        this.f18430a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkc0) && this.f18430a == ((kkc0) obj).f18430a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18430a);
    }

    public final String toString() {
        return ua80.e(this.f18430a, "GameResultInfo(resultPoints=", Separators.RPAREN);
    }
}
