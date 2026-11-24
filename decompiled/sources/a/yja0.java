package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yja0 implements dka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42731a;

    public yja0(int i) {
        this.f42731a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yja0) && this.f42731a == ((yja0) obj).f42731a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42731a);
    }

    public final String toString() {
        return ua80.e(this.f42731a, "OnAppBarIconClicked(iconId=", Separators.RPAREN);
    }
}
