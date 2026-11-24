package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class apa extends fpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1242a;

    public apa(int i) {
        this.f1242a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apa) && this.f1242a == ((apa) obj).f1242a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1242a);
    }

    public final String toString() {
        return ua80.e(this.f1242a, "PeriodSizeChanged(periodInfoUiModelListSize=", Separators.RPAREN);
    }
}
