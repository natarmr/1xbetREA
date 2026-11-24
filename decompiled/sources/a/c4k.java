package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class c4k {
    public static final y3k Companion = new y3k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4k f3729a;

    public /* synthetic */ c4k(int i, b4k b4kVar) {
        if (1 == (i & 1)) {
            this.f3729a = b4kVar;
        } else {
            m2x.I(i, 1, x3k.f40223a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4k) && Intrinsics.d(this.f3729a, ((c4k) obj).f3729a);
    }

    public final int hashCode() {
        return this.f3729a.f1963a.hashCode();
    }

    public final String toString() {
        return "Delete2FaRequest(data=" + this.f3729a + Separators.RPAREN;
    }

    public c4k(b4k b4kVar) {
        this.f3729a = b4kVar;
    }
}
