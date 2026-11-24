package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class k7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17824a;

    public k7j0(String str) {
        str.getClass();
        this.f17824a = str;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_globus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7j0) && Intrinsics.d(this.f17824a, ((k7j0) obj).f17824a);
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return false;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return true;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f17824a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_globus, this.f17824a.hashCode() * 31, 961), 31, true), 31, true), 31, false);
    }

    @Override // a.b8j0
    public final boolean i() {
        return true;
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
        return dw9.n(R.drawable.ic_globus, "LanguageUiModel(title=", this.f17824a, ", image=", ", endText=, enable=true, clickable=true, first=false, last=true)");
    }
}
