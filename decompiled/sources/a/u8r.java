package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class u8r {
    public static final t8r Companion = new t8r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8r f35244a;
    public final r8r b;

    public /* synthetic */ u8r(int i, r8r r8rVar, r8r r8rVar2) {
        if ((i & 1) == 0) {
            this.f35244a = null;
        } else {
            this.f35244a = r8rVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r8rVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8r)) {
            return false;
        }
        u8r u8rVar = (u8r) obj;
        return Intrinsics.d(this.f35244a, u8rVar.f35244a) && Intrinsics.d(this.b, u8rVar.b);
    }

    public final int hashCode() {
        r8r r8rVar = this.f35244a;
        int iHashCode = (r8rVar == null ? 0 : r8rVar.hashCode()) * 31;
        r8r r8rVar2 = this.b;
        return iHashCode + (r8rVar2 != null ? r8rVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FreeValueConfigurationTimeResponse(min=" + this.f35244a + ", max=" + this.b + Separators.RPAREN;
    }
}
