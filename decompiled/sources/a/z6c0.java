package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zyc0 f43860a;
    public final vyc0 b;
    public final tlc0 c;
    public final String d;

    public z6c0(zyc0 zyc0Var, vyc0 vyc0Var, tlc0 tlc0Var, String str) {
        str.getClass();
        this.f43860a = zyc0Var;
        this.b = vyc0Var;
        this.c = tlc0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6c0)) {
            return false;
        }
        z6c0 z6c0Var = (z6c0) obj;
        return this.f43860a.equals(z6c0Var.f43860a) && this.b == z6c0Var.b && this.c.equals(z6c0Var.c) && Intrinsics.d(this.d, z6c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f43860a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PromoBetTabUiState(promoCodeFieldUiState=" + this.f43860a + ", promoCodeStyle=" + this.b + ", promoInfoUiState=" + this.c + ", infoLineText=" + this.d + Separators.RPAREN;
    }
}
