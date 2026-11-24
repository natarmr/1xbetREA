package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ygj0 implements ehj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42587a;
    public final boolean b;

    public ygj0(String str, boolean z) {
        i8m0 i8m0Var = i8m0.CHECK;
        str.getClass();
        this.f42587a = str;
        this.b = z;
    }

    @Override // a.ehj0
    public final int b() {
        return R.drawable.ic_glyph_authorization_history;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygj0)) {
            return false;
        }
        ygj0 ygj0Var = (ygj0) obj;
        if (!Intrinsics.d(this.f42587a, ygj0Var.f42587a)) {
            return false;
        }
        i8m0 i8m0Var = i8m0.CHECK;
        return this.b == ygj0Var.b;
    }

    @Override // a.ehj0
    public final String getSubTitle() {
        return "";
    }

    @Override // a.ehj0
    public final String getTitle() {
        return this.f42587a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(w6x.g(i8m0.CHECK, twn.a(R.drawable.ic_glyph_authorization_history, this.f42587a.hashCode() * 31, 961), 961), 31, this.b);
    }

    @Override // a.ehj0
    public final boolean i() {
        return this.b;
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
        i8m0 i8m0Var = i8m0.CHECK;
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_authorization_history, "AuthHistoryUiModel(title=", this.f42587a, ", image=", ", subTitle=, stateStatus=");
        sbP.append(i8m0Var);
        sbP.append(", endText=, enable=");
        sbP.append(this.b);
        sbP.append(", clickable=true)");
        return sbP.toString();
    }

    @Override // a.ehj0
    public final i8m0 y() {
        return i8m0.CHECK;
    }
}
