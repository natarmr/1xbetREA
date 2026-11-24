package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wrt0 extends xrt0 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrt0(String str) {
        super(str);
        str.getClass();
        this.b = str;
    }

    @Override // a.xrt0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrt0) && Intrinsics.d(this.b, ((wrt0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("Unknown(id=", this.b, Separators.RPAREN);
    }
}
