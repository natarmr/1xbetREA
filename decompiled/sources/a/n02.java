package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n02 implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f22680a;
    public final String b;

    public n02(u0f0 u0f0Var, String str) {
        str.getClass();
        this.f22680a = u0f0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n02)) {
            return false;
        }
        n02 n02Var = (n02) obj;
        return this.f22680a == n02Var.f22680a && Intrinsics.d(this.b, n02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22680a.hashCode() * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return this.f22680a;
    }

    public final String toString() {
        return "AgreementFieldUiModel(registrationFieldType=" + this.f22680a + ", title=" + this.b + Separators.RPAREN;
    }
}
