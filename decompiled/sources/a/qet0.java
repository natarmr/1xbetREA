package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qet0 {
    public static final pet0 Companion = new pet0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28600a;

    public /* synthetic */ qet0(int i, String str) {
        if (1 == (i & 1)) {
            this.f28600a = str;
        } else {
            m2x.I(i, 1, oet0.f25139a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qet0) && Intrinsics.d(this.f28600a, ((qet0) obj).f28600a);
    }

    public final int hashCode() {
        return this.f28600a.hashCode();
    }

    public final String toString() {
        return kng0.l("UnregisterAllRequest(appGuid=", this.f28600a, Separators.RPAREN);
    }

    public qet0(String str) {
        str.getClass();
        this.f28600a = str;
    }
}
