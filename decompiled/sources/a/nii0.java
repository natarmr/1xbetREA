package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23589a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public nii0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        ohs0.z(str, str2, str3, str4, str5);
        ohs0.z(str6, str7, str8, str9, str10);
        this.f23589a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nii0)) {
            return false;
        }
        nii0 nii0Var = (nii0) obj;
        return Intrinsics.d(this.f23589a, nii0Var.f23589a) && Intrinsics.d(this.b, nii0Var.b) && Intrinsics.d(this.c, nii0Var.c) && Intrinsics.d(this.d, nii0Var.d) && Intrinsics.d(this.e, nii0Var.e) && Intrinsics.d(this.f, nii0Var.f) && Intrinsics.d(this.g, nii0Var.g) && Intrinsics.d(this.h, nii0Var.h) && Intrinsics.d(this.i, nii0Var.i) && Intrinsics.d(this.j, nii0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f23589a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ServiceStatsModel(aces=", this.f23589a, ", doubleFaults=", this.b, ", firstServe=");
        f140.v(sbN, this.c, ", firstServePointsWon=", this.d, ", secondServePointsWon=");
        f140.v(sbN, this.e, ", breakPointsFaced=", this.f, ", breakPointsSaved=");
        f140.v(sbN, this.g, ", serviceGamesPlayed=", this.h, ", serviceGamesWon=");
        return ua80.m(sbN, this.i, ", totalServicePointsWon=", this.j, Separators.RPAREN);
    }
}
