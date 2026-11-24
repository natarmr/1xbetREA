package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class y8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42198a;

    public y8j0(String str) {
        str.getClass();
        this.f42198a = str;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_widget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8j0) && Intrinsics.d(this.f42198a, ((y8j0) obj).f42198a);
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f42198a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_widget, this.f42198a.hashCode() * 31, 961), 31, true);
    }

    @Override // a.z8j0
    public final boolean i() {
        return true;
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
        return dw9.n(R.drawable.ic_glyph_widget, "WidgetUiModel(title=", this.f42198a, ", image=", ", endText=, enable=true, clickable=true)");
    }
}
