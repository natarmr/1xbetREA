package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wvd {
    public static final vvd Companion = new vvd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39832a;

    public /* synthetic */ wvd(int i, String str) {
        if (1 == (i & 1)) {
            this.f39832a = str;
        } else {
            m2x.I(i, 1, uvd.f36343a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wvd) && Intrinsics.d(this.f39832a, ((wvd) obj).f39832a);
    }

    public final int hashCode() {
        return this.f39832a.hashCode();
    }

    public final String toString() {
        return kng0.l("ConfirmByCodeRequest(code=", this.f39832a, Separators.RPAREN);
    }

    public wvd(String str) {
        str.getClass();
        this.f39832a = str;
    }
}
