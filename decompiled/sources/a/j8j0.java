package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class j8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16087a;
    public final boolean b;

    public j8j0(String str, boolean z) {
        str.getClass();
        this.f16087a = str;
        this.b = z;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_newsletter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8j0)) {
            return false;
        }
        j8j0 j8j0Var = (j8j0) obj;
        return Intrinsics.d(this.f16087a, j8j0Var.f16087a) && this.b == j8j0Var.b;
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f16087a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_newsletter, this.f16087a.hashCode() * 31, 961), 31, this.b);
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
        return rw2.p(kng0.p(R.drawable.ic_glyph_newsletter, "MailingManagementUiModel(title=", this.f16087a, ", image=", ", endText=, enable="), this.b, ", clickable=true)");
    }
}
