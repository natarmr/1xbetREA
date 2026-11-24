package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jwz implements wwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17276a;
    public final String b;
    public final int c;

    public jwz(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f17276a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwz)) {
            return false;
        }
        jwz jwzVar = (jwz) obj;
        return Intrinsics.d(this.f17276a, jwzVar.f17276a) && Intrinsics.d(this.b, jwzVar.b) && this.c == jwzVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f17276a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("LimitsIeHeaderWithDescriptionUiModel(title=", this.f17276a, ", description=", this.b, ", index="));
    }
}
