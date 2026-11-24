package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class x8c {
    public static final w8c Companion = new w8c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40455a;

    public /* synthetic */ x8c(int i, String str) {
        if (1 == (i & 1)) {
            this.f40455a = str;
        } else {
            m2x.I(i, 1, v8c.f36974a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8c) && Intrinsics.d(this.f40455a, ((x8c) obj).f40455a);
    }

    public final int hashCode() {
        return this.f40455a.hashCode();
    }

    public final String toString() {
        return kng0.l("Data(token=", this.f40455a, Separators.RPAREN);
    }

    public x8c(String str) {
        str.getClass();
        this.f40455a = str;
    }
}
