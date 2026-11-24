package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hhj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13067a;
    public final String b;
    public final i8m0 c;
    public final boolean d;
    public final boolean e;

    public hhj0(String str, String str2, i8m0 i8m0Var, boolean z, boolean z2) {
        this.f13067a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_document;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhj0)) {
            return false;
        }
        hhj0 hhj0Var = (hhj0) obj;
        return this.f13067a.equals(hhj0Var.f13067a) && this.b.equals(hhj0Var.b) && this.c == hhj0Var.c && this.d == hhj0Var.d && this.e == hhj0Var.e;
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f13067a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_document, this.f13067a.hashCode() * 31, 31), 31, this.b), 961), 31, this.d);
    }

    @Override // a.rhj0
    public final boolean k() {
        return this.e;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    @Override // a.rhj0
    public final boolean q0() {
        return this.d;
    }

    public final String toString() {
        String strA = nhj0.a(this.b);
        String strA2 = mhj0.a(this.c);
        String strA3 = lhj0.a("");
        String strA4 = khj0.a(this.d);
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_document, "IdentificationUiModel(title=", this.f13067a, ", image=", ", subTitle=");
        f140.v(sbP, strA, ", stateStatus=", strA2, ", endText=");
        f140.v(sbP, strA3, ", enable=", strA4, ", clickable=");
        return rw2.p(sbP, this.e, Separators.RPAREN);
    }

    @Override // a.rhj0
    public final String u0() {
        return this.b;
    }

    @Override // a.rhj0
    public final i8m0 v0() {
        return this.c;
    }
}
