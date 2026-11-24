package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mpm f15659a;
    public final String b;
    public final c280 c;
    public final String d;
    public final c280 e;
    public final String f;
    public final kgp0 g;
    public final long h;

    public j00(mpm mpmVar, String str, c280 c280Var, String str2, c280 c280Var2, String str3, kgp0 kgp0Var, long j) {
        str3.getClass();
        this.f15659a = mpmVar;
        this.b = str;
        this.c = c280Var;
        this.d = str2;
        this.e = c280Var2;
        this.f = str3;
        this.g = kgp0Var;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        if (!this.f15659a.equals(j00Var.f15659a) || !this.b.equals(j00Var.b) || !this.c.equals(j00Var.c) || !this.d.equals(j00Var.d) || !this.e.equals(j00Var.e) || !Intrinsics.d(this.f, j00Var.f) || this.g != j00Var.g) {
            return false;
        }
        long j = j00Var.h;
        int i = y3d.h;
        return h2t0.a(this.h, j);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ua80.b(hne.g(this.e, ua80.b(hne.g(this.c, ua80.b(this.f15659a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + iHashCode;
    }

    public final String toString() {
        return "AdditionalMiddleUiModel(score=" + this.f15659a + ", firstTitleOpp=" + this.b + ", firstImageOpp=" + this.c + ", secondTitleOpp=" + this.d + ", secondImageOpp=" + this.e + ", oppNumberTitle=" + this.f + ", teamNumber=" + this.g + ", oppNumberTitleBackgroundColor=" + y3d.i(this.h) + Separators.RPAREN;
    }
}
