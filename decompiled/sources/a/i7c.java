package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class i7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14286a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final SpannableStringBuilder f;
    public final i6c g;
    public final m6c h;
    public final n6c i;
    public final u6c j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public i7c(int i, int i2, boolean z, boolean z2, String str, SpannableStringBuilder spannableStringBuilder, i6c i6cVar, m6c m6cVar, n6c n6cVar, u6c u6cVar, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f14286a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = spannableStringBuilder;
        this.g = i6cVar;
        this.h = m6cVar;
        this.i = n6cVar;
        this.j = u6cVar;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
    }

    public static i7c a(i7c i7cVar, String str, m6c m6cVar, n6c n6cVar, u6c u6cVar, boolean z, boolean z2, boolean z3, int i) {
        int i2 = i7cVar.f14286a;
        int i3 = i7cVar.b;
        boolean z4 = i7cVar.c;
        boolean z5 = i7cVar.d;
        String str2 = (i & 16) != 0 ? i7cVar.e : str;
        SpannableStringBuilder spannableStringBuilder = i7cVar.f;
        i6c i6cVar = (i & 64) != 0 ? i7cVar.g : i6c.f14232a;
        m6c m6cVar2 = (i & 128) != 0 ? i7cVar.h : m6cVar;
        n6c n6cVar2 = (i & 256) != 0 ? i7cVar.i : n6cVar;
        u6c u6cVar2 = (i & 512) != 0 ? i7cVar.j : u6cVar;
        boolean z6 = i7cVar.k;
        boolean z7 = (i & 2048) != 0 ? i7cVar.l : z;
        boolean z8 = (i & 4096) != 0 ? i7cVar.m : z2;
        boolean z9 = (i & 8192) != 0 ? i7cVar.n : z3;
        i7cVar.getClass();
        return new i7c(i2, i3, z4, z5, str2, spannableStringBuilder, i6cVar, m6cVar2, n6cVar2, u6cVar2, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7c)) {
            return false;
        }
        i7c i7cVar = (i7c) obj;
        return this.f14286a == i7cVar.f14286a && this.b == i7cVar.b && this.c == i7cVar.c && this.d == i7cVar.d && this.e.equals(i7cVar.e) && this.f.equals(i7cVar.f) && this.g.equals(i7cVar.g) && this.h.equals(i7cVar.h) && this.i.equals(i7cVar.i) && this.j.equals(i7cVar.j) && this.k == i7cVar.k && this.l == i7cVar.l && this.m == i7cVar.m && this.n == i7cVar.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + brm0.e(brm0.e(brm0.e((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((((this.f.hashCode() + ua80.b(brm0.e(brm0.e(twn.a(this.b, Integer.hashCode(this.f14286a) * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31) - 1466058868) * 31)) * 31)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("UiState(actionBtnResId=", this.f14286a, ", titleResId=", ", cantGetCodeVisible=", this.b);
        ua80.u(", antiSpamVisible=", ", inputCode=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", message=");
        sbT.append((Object) this.f);
        sbT.append(", firstButtonState=");
        sbT.append(this.g);
        sbT.append(", secondButtonState=");
        sbT.append(this.h);
        sbT.append(", thirdButtonState=");
        sbT.append(this.i);
        sbT.append(", timerTextState=");
        sbT.append(this.j);
        sbT.append(", hasVoiceSms=");
        ua80.u(", enableConfirmButton=", ", networkConnected=", sbT, this.k, this.l);
        return ohs0.p(", loading=", Separators.RPAREN, sbT, this.m, this.n);
    }
}
