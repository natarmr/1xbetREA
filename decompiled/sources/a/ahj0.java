package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ahj0 implements ehj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f878a;
    public final String b;
    public final i8m0 c;
    public final boolean d;
    public final boolean e;

    public ahj0(String str, String str2, i8m0 i8m0Var, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f878a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // a.ehj0
    public final int b() {
        return R.drawable.ic_glyph_document;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahj0)) {
            return false;
        }
        ahj0 ahj0Var = (ahj0) obj;
        return Intrinsics.d(this.f878a, ahj0Var.f878a) && Intrinsics.d(this.b, ahj0Var.b) && this.c == ahj0Var.c && this.d == ahj0Var.d && this.e == ahj0Var.e;
    }

    @Override // a.ehj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.ehj0
    public final String getTitle() {
        return this.f878a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_document, this.f878a.hashCode() * 31, 31), 31, this.b), 961), 31, this.d);
    }

    @Override // a.ehj0
    public final boolean i() {
        return this.d;
    }

    @Override // a.ehj0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_document, "IdentificationUiModel(title=", this.f878a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=");
        return ohs0.p(", clickable=", Separators.RPAREN, sbP, this.d, this.e);
    }

    @Override // a.ehj0
    public final i8m0 y() {
        return this.c;
    }
}
