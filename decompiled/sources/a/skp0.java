package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class skp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32363a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    public skp0(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        cs0.x(str2, str4, str5, str6);
        this.f32363a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skp0)) {
            return false;
        }
        skp0 skp0Var = (skp0) obj;
        if (!this.f32363a.equals(skp0Var.f32363a) || !Intrinsics.d(this.b, skp0Var.b) || !this.c.equals(skp0Var.c) || !Intrinsics.d(this.d, skp0Var.d) || !Intrinsics.d(this.e, skp0Var.e) || !Intrinsics.d(this.f, skp0Var.f)) {
            return false;
        }
        long j = skp0Var.g;
        int i = y3d.h;
        return h2t0.a(this.g, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f32363a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.g) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.g);
        StringBuilder sbN = b1j.n("TeamSquadPlayerStatisticUiModel(id=", this.f32363a, ", number=", this.b, ", name=");
        f140.v(sbN, this.c, ", age=", this.d, ", games=");
        f140.v(sbN, this.e, ", goals=", this.f, ", backgroundColor=");
        return axq.n(sbN, strI, Separators.RPAREN);
    }
}
