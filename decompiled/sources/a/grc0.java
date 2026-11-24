package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class grc0 implements jrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final shc0 f11773a;
    public final nuc0 b;
    public final frc0 c;

    public grc0(shc0 shc0Var, nuc0 nuc0Var, frc0 frc0Var) {
        shc0Var.getClass();
        nuc0Var.getClass();
        frc0Var.getClass();
        this.f11773a = shc0Var;
        this.b = nuc0Var;
        this.c = frc0Var;
    }

    @Override // a.jrc0
    public final shc0 a() {
        return this.f11773a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grc0)) {
            return false;
        }
        grc0 grc0Var = (grc0) obj;
        return Intrinsics.d(this.f11773a, grc0Var.f11773a) && Intrinsics.d(this.b, grc0Var.b) && Intrinsics.d(this.c, grc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f11773a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(toolbarUiModel=" + this.f11773a + ", promoStoreCollection=" + this.b + ", promoShopDetailUiModel=" + this.c + Separators.RPAREN;
    }
}
