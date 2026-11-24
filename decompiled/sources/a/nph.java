package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nph implements pph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23914a;
    public final String b;
    public final m0x c;

    public nph(String str, String str2, m0x m0xVar) {
        str.getClass();
        this.f23914a = str;
        this.b = str2;
        this.c = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nph)) {
            return false;
        }
        nph nphVar = (nph) obj;
        return Intrinsics.d(this.f23914a, nphVar.f23914a) && this.b.equals(nphVar.b) && this.c.equals(nphVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f23914a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberUFCIconCellUiModel(title=", this.f23914a, ", value=", this.b, ", icon=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
