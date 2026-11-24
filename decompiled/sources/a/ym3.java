package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ym3 implements zm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42867a;

    public ym3(int i) {
        this.f42867a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym3) && this.f42867a == ((ym3) obj).f42867a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42867a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return ua80.e(this.f42867a, "Progress(isBackButtonEnable=false, value=", Separators.RPAREN);
    }
}
