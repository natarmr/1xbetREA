package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31238a;
    public final String b;
    public final String c;
    public final ox d;

    public rx(int i, String str, String str2, ox oxVar) {
        str.getClass();
        str2.getClass();
        this.f31238a = i;
        this.b = str;
        this.c = str2;
        this.d = oxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return this.f31238a == rxVar.f31238a && Intrinsics.d(this.b, rxVar.b) && Intrinsics.d(this.c, rxVar.c) && this.d.equals(rxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f31238a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f31238a, "AdditionalInfoButtonUiModel(icon=", ", title=", this.b, ", subtitle=");
        sbR.append(this.c);
        sbR.append(", action=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
