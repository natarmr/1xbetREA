package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sdp implements tdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32044a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final boolean j;

    public sdp(long j, String str, String str2, String str3, int i, String str4, String str5, int i2, int i3, boolean z) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f32044a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = i2;
        this.i = i3;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdp)) {
            return false;
        }
        sdp sdpVar = (sdp) obj;
        return this.f32044a == sdpVar.f32044a && Intrinsics.d(this.b, sdpVar.b) && Intrinsics.d(this.c, sdpVar.c) && Intrinsics.d(this.d, sdpVar.d) && this.e == sdpVar.e && Intrinsics.d(this.f, sdpVar.f) && Intrinsics.d(this.g, sdpVar.g) && this.h == sdpVar.h && this.i == sdpVar.i && this.j == sdpVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(twn.a(this.e, ua80.b(ua80.b(ua80.b(Long.hashCode(this.f32044a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32044a, "ViewedCard(id=", ", imageUrl=", this.b);
        f140.v(sbO, ", fallbackImageUrl=", this.c, ", champLabel=", this.d);
        w6x.w(this.e, ", captionIcon=", ", opponentLabel=", this.f, sbO);
        axq.s(this.h, ", infoLabel=", this.g, ", placeholder=", sbO);
        dw9.v(this.i, ", errorRes=", ", underMaintenance=", sbO, this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
