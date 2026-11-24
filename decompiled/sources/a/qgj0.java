package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qgj0 implements wgj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28688a;
    public final boolean b;
    public final boolean c;

    public qgj0(String str, boolean z, boolean z2) {
        i8m0 i8m0Var = i8m0.CHECK;
        str.getClass();
        this.f28688a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // a.wgj0
    public final int b() {
        return R.drawable.ic_glyph_authorization_history;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgj0)) {
            return false;
        }
        qgj0 qgj0Var = (qgj0) obj;
        if (!Intrinsics.d(this.f28688a, qgj0Var.f28688a)) {
            return false;
        }
        i8m0 i8m0Var = i8m0.CHECK;
        return this.b == qgj0Var.b && this.c == qgj0Var.c;
    }

    @Override // a.wgj0
    public final boolean getFirst() {
        return false;
    }

    @Override // a.wgj0
    public final boolean getLast() {
        return true;
    }

    @Override // a.wgj0
    public final String getSubTitle() {
        return "";
    }

    @Override // a.wgj0
    public final String getTitle() {
        return this.f28688a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e(brm0.e(w6x.g(i8m0.CHECK, twn.a(R.drawable.ic_glyph_authorization_history, this.f28688a.hashCode() * 31, 961), 961), 31, this.b), 31, this.c), 31, false);
    }

    @Override // a.wgj0
    public final boolean i() {
        return this.b;
    }

    @Override // a.wgj0
    public final boolean k() {
        return this.c;
    }

    @Override // a.wgj0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        i8m0 i8m0Var = i8m0.CHECK;
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_authorization_history, "AuthHistoryUiModel(title=", this.f28688a, ", image=", ", subTitle=, stateStatus=");
        sbP.append(i8m0Var);
        sbP.append(", endText=, enable=");
        sbP.append(this.b);
        sbP.append(", clickable=");
        return rw2.p(sbP, this.c, ", first=false, last=true)");
    }

    @Override // a.wgj0
    public final i8m0 y() {
        return i8m0.CHECK;
    }
}
