package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class znw extends v8b {
    public final String d;
    public final int e;

    public znw(String str, int i) {
        super(30, null, null, q3d.j(vqd.e(str, str), new g9b(i)));
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znw)) {
            return false;
        }
        znw znwVar = (znw) obj;
        return Intrinsics.d(this.d, znwVar.d) && this.e == znwVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "ColumnTitleCell(title=", this.d, ", spaceWidth=", Separators.RPAREN);
    }
}
