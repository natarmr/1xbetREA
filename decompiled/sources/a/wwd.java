package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wwd {
    public static final vwd Companion = new vwd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39881a;

    public /* synthetic */ wwd(int i, String str) {
        if (1 == (i & 1)) {
            this.f39881a = str;
        } else {
            m2x.I(i, 1, uwd.f36386a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwd) && Intrinsics.d(this.f39881a, ((wwd) obj).f39881a);
    }

    public final int hashCode() {
        return this.f39881a.hashCode();
    }

    public final String toString() {
        return kng0.l("ConfirmOperationRequest(signature=", this.f39881a, Separators.RPAREN);
    }

    public wwd(String str) {
        this.f39881a = str;
    }
}
