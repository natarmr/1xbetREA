package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hrc0 implements jrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final shc0 f13524a;
    public final mdm b;

    public hrc0(shc0 shc0Var, mdm mdmVar) {
        shc0Var.getClass();
        this.f13524a = shc0Var;
        this.b = mdmVar;
    }

    @Override // a.jrc0
    public final shc0 a() {
        return this.f13524a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrc0)) {
            return false;
        }
        hrc0 hrc0Var = (hrc0) obj;
        return Intrinsics.d(this.f13524a, hrc0Var.f13524a) && this.b.equals(hrc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13524a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(toolbarUiModel=" + this.f13524a + ", config=" + this.b + Separators.RPAREN;
    }
}
