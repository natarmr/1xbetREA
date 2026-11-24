package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nnd implements mnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23815a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final boolean o;

    public nnd(List list, List list2, String str, String str2, List list3, List list4, boolean z, long j, String str3, String str4, String str5, boolean z2, boolean z3, String str6, boolean z4) {
        list.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        str4.getClass();
        str5.getClass();
        this.f23815a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = list3;
        this.f = list4;
        this.g = z;
        this.h = j;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z2;
        this.m = z3;
        this.n = str6;
        this.o = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnd)) {
            return false;
        }
        nnd nndVar = (nnd) obj;
        return Intrinsics.d(this.f23815a, nndVar.f23815a) && Intrinsics.d(this.b, nndVar.b) && Intrinsics.d(this.c, nndVar.c) && Intrinsics.d(this.d, nndVar.d) && Intrinsics.d(this.e, nndVar.e) && Intrinsics.d(this.f, nndVar.f) && this.g == nndVar.g && this.h == nndVar.h && this.i.equals(nndVar.i) && Intrinsics.d(this.j, nndVar.j) && Intrinsics.d(this.k, nndVar.k) && this.l == nndVar.l && this.m == nndVar.m && Intrinsics.d(this.n, nndVar.n) && this.o == nndVar.o;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(brm0.e(dw9.a(dw9.a(ua80.b(ua80.b(dw9.a(this.f23815a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str = this.n;
        return Boolean.hashCode(this.o) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CompressedCardCommonModel(teamOneIds=", ", teamTwoIds=", this.f23815a, ", teamOneName=", this.b);
        f140.v(sbT, this.c, ", teamTwoName=", this.d, ", teamOneImageUrls=");
        b1j.y(", teamTwoImageUrls=", ", finished=", sbT, this.e, this.f);
        rw2.v(this.h, ", sportId=", sbT, this.g);
        f140.v(sbT, ", matchFormat=", this.i, ", vid=", this.j);
        w6x.z(", dopInfo=", this.k, ", hostsVsGuests=", sbT, this.l);
        hne.u(", live=", ", subGameName=", this.n, sbT, this.m);
        return f140.n(sbT, ", nonStarted=", this.o, Separators.RPAREN);
    }
}
