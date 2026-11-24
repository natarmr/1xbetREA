package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kaa0 {
    public static final z9a0 Companion = new z9a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17954a;
    public final String b;

    public /* synthetic */ kaa0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f17954a = null;
        } else {
            this.f17954a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaa0)) {
            return false;
        }
        kaa0 kaa0Var = (kaa0) obj;
        return Intrinsics.d(this.f17954a, kaa0Var.f17954a) && Intrinsics.d(this.b, kaa0Var.b);
    }

    public final int hashCode() {
        Long l = this.f17954a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f17954a, "PlayerResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
