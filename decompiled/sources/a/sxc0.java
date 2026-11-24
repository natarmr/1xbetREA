package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sxc0 implements uxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd50 f32971a;
    public final mdm b;

    public sxc0(gd50 gd50Var, mdm mdmVar) {
        gd50Var.getClass();
        this.f32971a = gd50Var;
        this.b = mdmVar;
    }

    @Override // a.uxc0
    public final gd50 a() {
        return this.f32971a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxc0)) {
            return false;
        }
        sxc0 sxc0Var = (sxc0) obj;
        return Intrinsics.d(this.f32971a, sxc0Var.f32971a) && this.b.equals(sxc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32971a.f11091a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarUiState=" + this.f32971a + ", config=" + this.b + Separators.RPAREN;
    }
}
