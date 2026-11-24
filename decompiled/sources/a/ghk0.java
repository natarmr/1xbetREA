package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ghk0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11305a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ ghk0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghk0)) {
            return false;
        }
        ghk0 ghk0Var = (ghk0) obj;
        return this.f11305a == ghk0Var.f11305a && Intrinsics.d(this.b, ghk0Var.b) && Intrinsics.d(this.c, ghk0Var.c) && Intrinsics.d(this.d, ghk0Var.d) && Intrinsics.d(this.e, ghk0Var.e) && Intrinsics.d(this.f, ghk0Var.f) && Intrinsics.d(this.g, ghk0Var.g) && Intrinsics.d(this.h, ghk0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f11305a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f11305a, "SocialData(socialType=", ", token=", this.b, ", tokenSecret=");
        f140.v(sbR, this.c, ", id=", this.d, ", name=");
        f140.v(sbR, this.e, ", surname=", this.f, ", email=");
        return ua80.m(sbR, this.g, ", phone=", this.h, Separators.RPAREN);
    }

    public ghk0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.f11305a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }
}
