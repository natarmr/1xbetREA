package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class l7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19562a;
    public final boolean b;

    public l7j0(String str, boolean z) {
        str.getClass();
        this.f19562a = str;
        this.b = z;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_newsletter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7j0)) {
            return false;
        }
        l7j0 l7j0Var = (l7j0) obj;
        return Intrinsics.d(this.f19562a, l7j0Var.f19562a) && this.b == l7j0Var.b;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return false;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return false;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f19562a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_newsletter, this.f19562a.hashCode() * 31, 961), 31, this.b), 31, true), 31, false);
    }

    @Override // a.b8j0
    public final boolean i() {
        return this.b;
    }

    @Override // a.b8j0
    public final boolean k() {
        return true;
    }

    @Override // a.b8j0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return rw2.p(kng0.p(R.drawable.ic_glyph_newsletter, "MailingManagementUiModel(title=", this.f19562a, ", image=", ", endText=, enable="), this.b, ", clickable=true, first=false, last=false)");
    }
}
