package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mwi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22505a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;

    public mwi0(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6) {
        brm0.B(str, str2, str3);
        this.f22505a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwi0)) {
            return false;
        }
        mwi0 mwi0Var = (mwi0) obj;
        return Intrinsics.d(this.f22505a, mwi0Var.f22505a) && Intrinsics.d(this.b, mwi0Var.b) && Intrinsics.d(this.c, mwi0Var.c) && this.d == mwi0Var.d && this.e == mwi0Var.e && this.f.equals(mwi0Var.f) && this.g.equals(mwi0Var.g) && this.h.equals(mwi0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(this.f22505a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SettingsAccordionBalanceUiModel(allAccountsTitle=", this.f22505a, ", topUpText=", this.b, ", payOutText=");
        brm0.C(this.c, ", payInEnabled=", ", payOutEnabled=", sbN, this.d);
        f140.s(", accountDescription=", this.f, ", sum=", sbN, this.e);
        return ua80.m(sbN, this.g, ", currency=", this.h, Separators.RPAREN);
    }
}
