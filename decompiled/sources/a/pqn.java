package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pqn {
    public static final oqn Companion = new oqn();
    public static final a8z[] h = {maz.a(wez.f39042a, new dcn(27)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpn f27422a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public /* synthetic */ pqn(int i, xpn xpnVar, String str, String str2, String str3, int i2, int i3, int i4) {
        if (127 != (i & 127)) {
            m2x.I(i, 127, nqn.f23969a.getDescriptor());
            throw null;
        }
        this.f27422a = xpnVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqn)) {
            return false;
        }
        pqn pqnVar = (pqn) obj;
        return Intrinsics.d(this.f27422a, pqnVar.f27422a) && Intrinsics.d(this.b, pqnVar.b) && Intrinsics.d(this.c, pqnVar.c) && Intrinsics.d(this.d, pqnVar.d) && this.e == pqnVar.e && this.f == pqnVar.f && this.g == pqnVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f27422a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditProfileRequest(data=");
        sb.append(this.f27422a);
        sb.append(", imageText=");
        sb.append(this.b);
        sb.append(", captchaId=");
        f140.v(sb, this.c, ", language=", this.d, ", partner=");
        axq.r(this.e, this.f, ", group=", ", whence=", sb);
        return rz4.j(this.g, Separators.RPAREN, sb);
    }

    public pqn(xpn xpnVar, String str, String str2, String str3) {
        this.f27422a = xpnVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = 1;
        this.f = 1357;
        this.g = 22;
    }
}
