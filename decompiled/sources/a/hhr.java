package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class hhr extends mir {
    public static final ghr Companion = new ghr();
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhr(String str, int i, String str2, String str3) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, fhr.f9555a.getDescriptor());
            throw null;
        }
        this.c = str2;
        if ((i & 4) == 0) {
            this.d = "GPWebAppSetPageTitle";
        } else {
            this.d = str3;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhr)) {
            return false;
        }
        hhr hhrVar = (hhr) obj;
        return Intrinsics.d(this.c, hhrVar.c) && Intrinsics.d(this.d, hhrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GPWebAppSetPageTitle(title=", this.c, ", eventName=", this.d, Separators.RPAREN);
    }
}
