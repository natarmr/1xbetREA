package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7011a;
    public final String b;
    public final m0x c;

    public e0x(String str, String str2, m0x m0xVar) {
        str.getClass();
        str2.getClass();
        this.f7011a = str;
        this.b = str2;
        this.c = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0x)) {
            return false;
        }
        e0x e0xVar = (e0x) obj;
        return Intrinsics.d(this.f7011a, e0xVar.f7011a) && Intrinsics.d(this.b, e0xVar.b) && this.c.equals(e0xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7011a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ImageHeaderTabUiModel(id=", this.f7011a, ", title=", this.b, ", icon=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
