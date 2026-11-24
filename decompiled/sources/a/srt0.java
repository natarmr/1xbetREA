package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class srt0 extends xrt0 {
    public final String b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srt0(String str, String str2) {
        super(str);
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    @Override // a.xrt0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srt0)) {
            return false;
        }
        srt0 srt0Var = (srt0) obj;
        return Intrinsics.d(this.b, srt0Var.b) && Intrinsics.d(this.c, srt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Client(id=", this.b, ", publicId=", this.c, Separators.RPAREN);
    }
}
