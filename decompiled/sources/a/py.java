package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class py {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27781a;
    public final wui0 b;

    public py(String str, wui0 wui0Var) {
        str.getClass();
        this.f27781a = str;
        this.b = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        return Intrinsics.d(this.f27781a, pyVar.f27781a) && this.b == pyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27781a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfoUiModel(text=" + this.f27781a + ", position=" + this.b + Separators.RPAREN;
    }
}
