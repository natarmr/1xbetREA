package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39442a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;

    public wnd(String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, int i5, int i6, boolean z) {
        str.getClass();
        str3.getClass();
        this.f39442a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnd)) {
            return false;
        }
        wnd wndVar = (wnd) obj;
        return Intrinsics.d(this.f39442a, wndVar.f39442a) && this.b.equals(wndVar.b) && this.c == wndVar.c && this.d == wndVar.d && this.e == wndVar.e && Intrinsics.d(this.f, wndVar.f) && this.g.equals(wndVar.g) && this.h == wndVar.h && this.i == wndVar.i && this.j == wndVar.j && this.k == wndVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + twn.a(this.j, twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f39442a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CompressedCardFootballPeriodModel(teamOneName=", this.f39442a, ", teamOneImageUrl=", this.b, ", teamOneCorners=");
        axq.r(this.c, this.d, ", teamOneYellowCards=", ", teamOneRedCards=", sbN);
        kng0.w(this.e, ", teamTwoName=", this.f, ", teamTwoImageUrl=", sbN);
        twn.w(this.h, this.g, ", teamTwoCorners=", ", teamTwoYellowCards=", sbN);
        axq.r(this.i, this.j, ", teamTwoRedCards=", ", hostsVsGuests=", sbN);
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
