package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g520 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10697a;

    public g520(int i) {
        this.f10697a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g520) && this.f10697a == ((g520) obj).f10697a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10697a);
    }

    public final String toString() {
        return ua80.e(this.f10697a, "SegmentTabClick(tabPosition=", Separators.RPAREN);
    }
}
