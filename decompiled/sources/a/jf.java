package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jf {
    public static final hf Companion = new hf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16400a;

    public /* synthetic */ jf(int i, String str) {
        if (1 == (i & 1)) {
            this.f16400a = str;
        } else {
            m2x.I(i, 1, gf.f11180a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf) && Intrinsics.d(this.f16400a, ((jf) obj).f16400a);
    }

    public final int hashCode() {
        return this.f16400a.hashCode();
    }

    public final String toString() {
        return kng0.l("AccountNumberUrlRequest(uri=", this.f16400a, Separators.RPAREN);
    }

    public jf() {
        this.f16400a = "/office/historypay";
    }
}
