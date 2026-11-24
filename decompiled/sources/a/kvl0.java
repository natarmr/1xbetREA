package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class kvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18961a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public kvl0(String str, String str2, String str3, String str4, String str5, long j) {
        this.f18961a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvl0)) {
            return false;
        }
        kvl0 kvl0Var = (kvl0) obj;
        return this.f18961a == kvl0Var.f18961a && this.b.equals(kvl0Var.b) && this.c.equals(kvl0Var.c) && Intrinsics.d(this.d, kvl0Var.d) && Intrinsics.d(this.e, kvl0Var.e) && Intrinsics.d(this.f, kvl0Var.f);
    }

    public final int hashCode() {
        int iA = twn.a(R.drawable.ic_glyph_stadium, ua80.b(ua80.b(Long.hashCode(this.f18961a) * 31, 31, this.b), 31, this.c), 31);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f18961a, "StadiumCellDefaultUiModel(id=", ", title=", this.b);
        axq.s(R.drawable.ic_glyph_stadium, ", image=", this.c, ", placeholder=", sbO);
        f140.v(sbO, ", capacity=", this.d, ", openedFrom=", this.e);
        return rw2.o(sbO, ", architectedBy=", this.f, Separators.RPAREN);
    }
}
