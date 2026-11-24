package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wet0 {
    public static final vet0 Companion = new vet0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39035a;

    public /* synthetic */ wet0(int i, String str) {
        if (1 == (i & 1)) {
            this.f39035a = str;
        } else {
            m2x.I(i, 1, uet0.f35547a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wet0) && Intrinsics.d(this.f39035a, ((wet0) obj).f39035a);
    }

    public final int hashCode() {
        return this.f39035a.hashCode();
    }

    public final String toString() {
        return kng0.l("UnregisterRequest(appGuid=", this.f39035a, Separators.RPAREN);
    }

    public wet0(String str) {
        str.getClass();
        this.f39035a = str;
    }
}
