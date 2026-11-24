package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y770 implements a870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42139a;

    public y770(int i) {
        this.f42139a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y770) && this.f42139a == ((y770) obj).f42139a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42139a);
    }

    public final String toString() {
        return ua80.e(this.f42139a, "OnToolbarButtonClick(buttonId=", Separators.RPAREN);
    }
}
