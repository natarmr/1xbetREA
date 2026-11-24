package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o330 implements p330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24563a;

    public o330(int i) {
        this.f24563a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o330) && this.f24563a == ((o330) obj).f24563a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24563a);
    }

    public final String toString() {
        return ua80.e(this.f24563a, "OnSizePresetSelected(position=", Separators.RPAREN);
    }
}
