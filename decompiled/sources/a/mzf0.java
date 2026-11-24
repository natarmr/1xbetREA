package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mzf0 {
    public static final hzf0 Companion = new hzf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22653a;
    public final String b;
    public final kzf0 c;

    public /* synthetic */ mzf0(int i, String str, String str2, kzf0 kzf0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, fzf0.f10405a.getDescriptor());
            throw null;
        }
        this.f22653a = str;
        this.b = str2;
        this.c = kzf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzf0)) {
            return false;
        }
        mzf0 mzf0Var = (mzf0) obj;
        return Intrinsics.d(this.f22653a, mzf0Var.f22653a) && Intrinsics.d(this.b, mzf0Var.b) && Intrinsics.d(this.c, mzf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f22653a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RestorePasswordRequest(id=", this.f22653a, ", rt=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public mzf0(String str, String str2, kzf0 kzf0Var) {
        str.getClass();
        this.f22653a = str;
        this.b = str2;
        this.c = kzf0Var;
    }
}
