package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class in5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15057a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;

    public in5(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        brm0.B(str4, str5, str6);
        this.f15057a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in5)) {
            return false;
        }
        in5 in5Var = (in5) obj;
        if (this.f15057a != in5Var.f15057a || this.b != in5Var.b || !this.c.equals(in5Var.c) || !this.d.equals(in5Var.d) || !this.e.equals(in5Var.e)) {
            return false;
        }
        long j = in5Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j) && Intrinsics.d(this.g, in5Var.g) && Intrinsics.d(this.h, in5Var.h) && Intrinsics.d(this.i, in5Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f15057a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + ua80.b(ua80.b(rw2.b(iB, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbQ = f140.q("BalanceUiState(showBalance=", ", showRegistrationsButtons=", ", money=", this.f15057a, this.b);
        f140.v(sbQ, this.c, ", currency=", this.d, ", balanceName=");
        f140.v(sbQ, this.e, ", authorizationButtonsBackground=", strI, ", authorizationButtonLabel=");
        f140.v(sbQ, this.g, ", registrationButtonLabel=", this.h, ", topUpButtonLabel=");
        return axq.n(sbQ, this.i, Separators.RPAREN);
    }
}
