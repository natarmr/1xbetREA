package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24307a;
    public final wui0 b;

    public ny(String str, wui0 wui0Var) {
        str.getClass();
        this.f24307a = str;
        this.b = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj;
        return Intrinsics.d(this.f24307a, nyVar.f24307a) && this.b == nyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24307a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfoUiModel(text=" + this.f24307a + ", position=" + this.b + Separators.RPAREN;
    }
}
