package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nan implements pan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23198a;
    public final String b;
    public final m0x c;
    public final mt90 d;

    public nan(String str, String str2, m0x m0xVar, mt90 mt90Var) {
        str.getClass();
        this.f23198a = str;
        this.b = str2;
        this.c = m0xVar;
        this.d = mt90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nan)) {
            return false;
        }
        nan nanVar = (nan) obj;
        return Intrinsics.d(this.f23198a, nanVar.f23198a) && Intrinsics.d(this.b, nanVar.b) && this.c.equals(nanVar.c) && this.d.equals(nanVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f23198a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + cs0.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f23198a, ", label=", this.b, ", imageLink=");
        sbN.append(this.c);
        sbN.append(", pictureBackground=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
