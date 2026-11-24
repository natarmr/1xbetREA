package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v38 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbn f36720a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final SpannableStringBuilder g;
    public final String h;

    public v38(kbn kbnVar, String str, boolean z, boolean z2, boolean z3, boolean z4, SpannableStringBuilder spannableStringBuilder, String str2) {
        str2.getClass();
        this.f36720a = kbnVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = spannableStringBuilder;
        this.h = str2;
    }

    public static v38 a(v38 v38Var, kbn kbnVar, String str, boolean z, boolean z2, SpannableStringBuilder spannableStringBuilder, int i) {
        if ((i & 1) != 0) {
            kbnVar = v38Var.f36720a;
        }
        kbn kbnVar2 = kbnVar;
        if ((i & 2) != 0) {
            str = v38Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = v38Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = v38Var.d;
        }
        boolean z4 = z2;
        boolean z5 = v38Var.e;
        boolean z6 = v38Var.f;
        if ((i & 64) != 0) {
            spannableStringBuilder = v38Var.g;
        }
        String str3 = v38Var.h;
        v38Var.getClass();
        kbnVar2.getClass();
        str3.getClass();
        return new v38(kbnVar2, str2, z3, z4, z5, z6, spannableStringBuilder, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v38)) {
            return false;
        }
        v38 v38Var = (v38) obj;
        return this.f36720a.equals(v38Var.f36720a) && this.b.equals(v38Var.b) && this.c == v38Var.c && this.d == v38Var.d && this.e == v38Var.e && this.f == v38Var.f && this.g.equals(v38Var.g) && Intrinsics.d(this.h, v38Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(this.f36720a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(dualPhoneCountry=");
        sb.append(this.f36720a);
        sb.append(", phoneNumber=");
        sb.append(this.b);
        sb.append(", loading=");
        ua80.u(", nextBtnEnabled=", ", antiSpamVisible=", sb, this.c, this.d);
        ua80.u(", visibleMoreInfo=", ", bottomMessage=", sb, this.e, this.f);
        sb.append((Object) this.g);
        sb.append(", title=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
