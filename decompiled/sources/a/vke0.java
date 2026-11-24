package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vke0 extends w8b {
    public final String d;

    public vke0(String str) {
        super(vqd.e(str, str), null, null, 30);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vke0) && Intrinsics.d(this.d, ((vke0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return kng0.l("CornerCell(text=", this.d, Separators.RPAREN);
    }
}
