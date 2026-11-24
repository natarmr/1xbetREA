package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class uci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35431a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final SpannableStringBuilder g;
    public final ici0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public uci0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, SpannableStringBuilder spannableStringBuilder, ici0 ici0Var, boolean z6, boolean z7, boolean z8) {
        this.f35431a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = spannableStringBuilder;
        this.h = ici0Var;
        this.i = z6;
        this.j = z7;
        this.k = z8;
    }

    public static uci0 a(uci0 uci0Var, boolean z, boolean z2, boolean z3, boolean z4, eci0 eci0Var, boolean z5, boolean z6, int i) {
        boolean z7 = uci0Var.f35431a;
        if ((i & 2) != 0) {
            z = uci0Var.b;
        }
        boolean z8 = z;
        if ((i & 4) != 0) {
            z2 = uci0Var.c;
        }
        boolean z9 = z2;
        boolean z10 = (i & 8) != 0 ? uci0Var.d : z3;
        boolean z11 = (i & 16) != 0 ? uci0Var.e : z4;
        int i2 = uci0Var.f;
        SpannableStringBuilder spannableStringBuilder = uci0Var.g;
        ici0 ici0Var = (i & 128) != 0 ? uci0Var.h : eci0Var;
        boolean z12 = (i & 256) != 0 ? uci0Var.i : z5;
        boolean z13 = uci0Var.j;
        uci0Var.getClass();
        boolean z14 = (i & 2048) != 0 ? uci0Var.k : z6;
        uci0Var.getClass();
        return new uci0(z7, z8, z9, z10, z11, i2, spannableStringBuilder, ici0Var, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uci0)) {
            return false;
        }
        uci0 uci0Var = (uci0) obj;
        return this.f35431a == uci0Var.f35431a && this.b == uci0Var.b && this.c == uci0Var.c && this.d == uci0Var.d && this.e == uci0Var.e && this.f == uci0Var.f && this.g.equals(uci0Var.g) && this.h.equals(uci0Var.h) && this.i == uci0Var.i && this.j == uci0Var.j && this.k == uci0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(brm0.e((this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f35431a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31)) * 31)) * 31, 31, this.i), 31, this.j), 31, false);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("UiState(authenticatorVisible=", ", smsVisible=", ", voiceSmsVisible=", this.f35431a, this.b);
        ua80.u(", telegramVisible=", ", callCodeVisible=", sbQ, this.c, this.d);
        ua80.q(this.f, ", titleResId=", ", message=", sbQ, this.e);
        sbQ.append((Object) this.g);
        sbQ.append(", activationState=");
        sbQ.append(this.h);
        sbQ.append(", networkConnected=");
        ua80.u(", antiSpamVisible=", ", mailingInfoVisible=false, loading=", sbQ, this.i, this.j);
        return rw2.p(sbQ, this.k, Separators.RPAREN);
    }
}
