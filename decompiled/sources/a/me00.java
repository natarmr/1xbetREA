package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class me00 extends ne00 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me00(String str) {
        super(rek0.b);
        str.getClass();
        this.b = str;
    }

    @Override // a.ne00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me00) && Intrinsics.d(this.b, ((me00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("Warning(message=", this.b, Separators.RPAREN);
    }
}
