package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26036a;
    public final wui0 b;

    public oy(String str, wui0 wui0Var) {
        str.getClass();
        this.f26036a = str;
        this.b = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy)) {
            return false;
        }
        oy oyVar = (oy) obj;
        return Intrinsics.d(this.f26036a, oyVar.f26036a) && this.b == oyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26036a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfoUiModel(text=" + this.f26036a + ", position=" + this.b + Separators.RPAREN;
    }
}
