package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class u8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35235a;
    public final boolean b;
    public final boolean c;

    public u8j0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f35235a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_share;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8j0)) {
            return false;
        }
        u8j0 u8j0Var = (u8j0) obj;
        return Intrinsics.d(this.f35235a, u8j0Var.f35235a) && this.b == u8j0Var.b && this.c == u8j0Var.c;
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f35235a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(twn.a(R.drawable.ic_glyph_share, this.f35235a.hashCode() * 31, 961), 31, this.b);
    }

    @Override // a.z8j0
    public final boolean i() {
        return this.b;
    }

    @Override // a.z8j0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ohs0.p(", clickable=", Separators.RPAREN, kng0.p(R.drawable.ic_glyph_share, "ShareAppUiModel(title=", this.f35235a, ", image=", ", endText=, enable="), this.b, this.c);
    }
}
