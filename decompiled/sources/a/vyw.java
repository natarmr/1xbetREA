package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class vyw implements xyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38269a;

    public /* synthetic */ vyw(int i) {
        this.f38269a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vyw) {
            return this.f38269a == ((vyw) obj).f38269a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38269a);
    }

    public final String toString() {
        return ua80.e(this.f38269a, "ColorImage(value=", Separators.RPAREN);
    }
}
