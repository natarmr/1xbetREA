package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class o7r {
    public static final h7r Companion = new h7r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7r f24799a;

    public /* synthetic */ o7r(int i, k7r k7rVar) {
        if ((i & 1) == 0) {
            this.f24799a = null;
        } else {
            this.f24799a = k7rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7r) && Intrinsics.d(this.f24799a, ((o7r) obj).f24799a);
    }

    public final int hashCode() {
        k7r k7rVar = this.f24799a;
        if (k7rVar == null) {
            return 0;
        }
        return k7rVar.hashCode();
    }

    public final String toString() {
        return "FrameParams(detail=" + this.f24799a + Separators.RPAREN;
    }

    public o7r(k7r k7rVar) {
        this.f24799a = k7rVar;
    }
}
