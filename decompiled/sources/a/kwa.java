package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kwa implements mwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18991a;
    public final String b;
    public final m0x c;
    public final jwa d;

    public kwa(String str, String str2, m0x m0xVar, jwa jwaVar) {
        str.getClass();
        str2.getClass();
        this.f18991a = str;
        this.b = str2;
        this.c = m0xVar;
        this.d = jwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwa)) {
            return false;
        }
        kwa kwaVar = (kwa) obj;
        return Intrinsics.d(this.f18991a, kwaVar.f18991a) && Intrinsics.d(this.b, kwaVar.b) && this.c.equals(kwaVar.c) && this.d.equals(kwaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.a(this.c, ua80.b(this.f18991a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f18991a, ", subtitle=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(", buttonState=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
