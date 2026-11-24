package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2062a;
    public final int b;
    public final r4i c;

    public b6m(i4 i4Var, int i, r4i r4iVar) {
        i4Var.getClass();
        r4iVar.getClass();
        this.f2062a = i4Var;
        this.b = i;
        this.c = r4iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6m)) {
            return false;
        }
        b6m b6mVar = (b6m) obj;
        return Intrinsics.d(this.f2062a, b6mVar.f2062a) && this.b == b6mVar.b && Intrinsics.d(this.c, b6mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f2062a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DsCyberGameHeaderTabsUiModel(tabs=" + this.f2062a + ", selectedTabIndex=" + this.b + ", tabColors=" + this.c + Separators.RPAREN;
    }
}
