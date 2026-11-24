package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class i8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14341a;

    public i8j0(String str) {
        str.getClass();
        this.f14341a = str;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_globus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8j0) && Intrinsics.d(this.f14341a, ((i8j0) obj).f14341a);
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f14341a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_globus, this.f14341a.hashCode() * 31, 961), 31, true);
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
        return dw9.n(R.drawable.ic_globus, "LanguageUiModel(title=", this.f14341a, ", image=", ", endText=, enable=true, clickable=true)");
    }
}
