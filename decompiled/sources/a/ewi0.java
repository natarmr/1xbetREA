package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ewi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8528a;
    public final int b;
    public final a4x c;
    public final String d;

    public ewi0(int i, a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f8528a = str;
        this.b = i;
        this.c = a4xVar;
        this.d = str + Separators.SP + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewi0)) {
            return false;
        }
        ewi0 ewi0Var = (ewi0) obj;
        return Intrinsics.d(this.f8528a, ewi0Var.f8528a) && this.b == ewi0Var.b && Intrinsics.d(this.c, ewi0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f8528a.hashCode() * 31, 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return cs0.n(kng0.p(this.b, "SettingTab(tabTitle=", this.f8528a, ", tabIcon=", ", settingsUiModels="), this.c, Separators.RPAREN);
    }
}
