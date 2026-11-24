package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lv50 implements mv50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20703a;

    public lv50(int i) {
        this.f20703a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv50) && this.f20703a == ((lv50) obj).f20703a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20703a);
    }

    public final String toString() {
        return ua80.e(this.f20703a, "OnUpdateTab(tabIndex=", Separators.RPAREN);
    }
}
