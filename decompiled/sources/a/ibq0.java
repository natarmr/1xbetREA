package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ibq0 implements jbq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14503a;

    public ibq0(int i) {
        this.f14503a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibq0) && this.f14503a == ((ibq0) obj).f14503a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14503a);
    }

    public final String toString() {
        return ua80.e(this.f14503a, "SelectItem(themeId=", Separators.RPAREN);
    }
}
