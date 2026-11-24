package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ho8 extends cwr0 {
    public final String q;

    public ho8(String str) {
        str.getClass();
        this.q = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho8) && Intrinsics.d(this.q, ((ho8) obj).q);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.q.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("BottomMarketHeaderExpandable(title=", this.q, ", expanded=false)");
    }
}
