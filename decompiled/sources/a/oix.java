package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class oix {
    public static final nix Companion = new nix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25332a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ oix(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, mix.f21867a.getDescriptor());
            throw null;
        }
        this.f25332a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oix)) {
            return false;
        }
        oix oixVar = (oix) obj;
        return Intrinsics.d(this.f25332a, oixVar.f25332a) && Intrinsics.d(this.b, oixVar.b) && Intrinsics.d(this.c, oixVar.c) && Intrinsics.d(this.d, oixVar.d) && Intrinsics.d(this.e, oixVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f25332a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + ua80.b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("InstallEventRequest(deviceId=", this.f25332a, ", bTag=", this.b, ", type=");
        f140.v(sbN, this.c, ", os=", this.d, ", bundle=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }

    public oix(String str, String str2, String str3) {
        str.getClass();
        this.f25332a = str;
        this.b = str2;
        this.c = str3;
        this.d = "android";
        this.e = "org.xbet.client1";
    }
}
