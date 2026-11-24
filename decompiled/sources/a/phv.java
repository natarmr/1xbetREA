package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class phv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27016a;
    public final String b;
    public final boolean c;

    public phv(String str, int i, boolean z) {
        str.getClass();
        this.f27016a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phv)) {
            return false;
        }
        phv phvVar = (phv) obj;
        return this.f27016a == phvVar.f27016a && Intrinsics.d(this.b, phvVar.b) && this.c == phvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f27016a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f27016a, "GroupSelectorUiModel(position=", ", text=", this.b, ", isSelected="), this.c, Separators.RPAREN);
    }
}
