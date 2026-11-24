package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31287a;
    public final wui0 b;

    public ry(String str, wui0 wui0Var) {
        str.getClass();
        this.f31287a = str;
        this.b = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry)) {
            return false;
        }
        ry ryVar = (ry) obj;
        return Intrinsics.d(this.f31287a, ryVar.f31287a) && this.b == ryVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31287a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfoUiModel(text=" + this.f31287a + ", position=" + this.b + Separators.RPAREN;
    }
}
