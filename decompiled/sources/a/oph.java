package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oph implements pph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25642a;
    public final String b;
    public final int c;

    public oph(int i, String str, String str2) {
        str.getClass();
        this.f25642a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oph)) {
            return false;
        }
        oph ophVar = (oph) obj;
        return Intrinsics.d(this.f25642a, ophVar.f25642a) && this.b.equals(ophVar.b) && this.c == ophVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f25642a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("CyberUFCProgressCellUiModel(title=", this.f25642a, ", value=", this.b, ", progress="));
    }
}
