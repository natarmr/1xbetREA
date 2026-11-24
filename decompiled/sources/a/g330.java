package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g330 implements p330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10593a;

    public g330(int i) {
        this.f10593a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g330) && this.f10593a == ((g330) obj).f10593a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10593a);
    }

    public final String toString() {
        return ua80.e(this.f10593a, "OnColorPresetSelected(position=", Separators.RPAREN);
    }
}
