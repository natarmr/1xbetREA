package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class pzi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27848a;
    public final String b;
    public final String c;
    public final d4d d;
    public final boolean e;

    public pzi0(String str, String str2, String str3, d4d d4dVar, boolean z) {
        str.getClass();
        str3.getClass();
        this.f27848a = str;
        this.b = str2;
        this.c = str3;
        this.d = d4dVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzi0)) {
            return false;
        }
        pzi0 pzi0Var = (pzi0) obj;
        return Intrinsics.d(this.f27848a, pzi0Var.f27848a) && this.b.equals(pzi0Var.b) && Intrinsics.d(this.c, pzi0Var.c) && this.d == pzi0Var.d && this.e == pzi0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(R.drawable.ic_glyph_phone, dw9.b(this.d, ua80.b(ua80.b(this.f27848a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SettingsAppVersionTabsUiModel(title=", this.f27848a, ", subTitle=", this.b, ", endText=");
        sbN.append(this.c);
        sbN.append(", endTextColor=");
        sbN.append(this.d);
        sbN.append(", leftIcon=");
        return ohs0.k(R.drawable.ic_glyph_phone, ", needUpdate=", Separators.RPAREN, sbN, this.e);
    }
}
