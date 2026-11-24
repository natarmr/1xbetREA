package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f36922a;
    public final ww00 b;

    public v7f0(a4x a4xVar, ww00 ww00Var) {
        a4xVar.getClass();
        this.f36922a = a4xVar;
        this.b = ww00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7f0)) {
            return false;
        }
        v7f0 v7f0Var = (v7f0) obj;
        return Intrinsics.d(this.f36922a, v7f0Var.f36922a) && this.b.equals(v7f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36922a.hashCode() * 31);
    }

    public final String toString() {
        return "RegistrationTypeChoiceDefaultContentUiModel(items=" + this.f36922a + ", loginUiModel=" + this.b + Separators.RPAREN;
    }
}
