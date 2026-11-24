package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ozr0 extends w8b {
    public final String d;

    public ozr0(String str) {
        super(vqd.e(str, str), null, null, 30);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozr0) && Intrinsics.d(this.d, ((ozr0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("ColumnHeader(title=", this.d, Separators.RPAREN);
    }
}
