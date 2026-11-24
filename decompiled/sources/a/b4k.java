package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b4k {
    public static final a4k Companion = new a4k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1963a;

    public /* synthetic */ b4k(int i, String str) {
        if (1 == (i & 1)) {
            this.f1963a = str;
        } else {
            m2x.I(i, 1, z3k.f43722a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4k) && Intrinsics.d(this.f1963a, ((b4k) obj).f1963a);
    }

    public final int hashCode() {
        return this.f1963a.hashCode();
    }

    public final String toString() {
        return kng0.l("HashData(hash=", this.f1963a, Separators.RPAREN);
    }

    public b4k(String str) {
        str.getClass();
        this.f1963a = str;
    }
}
