package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class idj extends w8b {
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idj(String str, String str2) {
        super(new h9b((String) idd.d(str, str2)), null, null, 30);
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idj)) {
            return false;
        }
        idj idjVar = (idj) obj;
        return Intrinsics.d(this.d, idjVar.d) && Intrinsics.d(this.e, idjVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DateCell(startDate=", this.d, ", endDate=", this.e, Separators.RPAREN);
    }
}
