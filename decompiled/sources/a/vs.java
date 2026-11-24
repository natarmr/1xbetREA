package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vs implements xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37924a;
    public final au90 b;

    public vs(String str, au90 au90Var) {
        str.getClass();
        this.f37924a = str;
        this.b = au90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs)) {
            return false;
        }
        vs vsVar = (vs) obj;
        return Intrinsics.d(this.f37924a, vsVar.f37924a) && this.b.equals(vsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37924a.hashCode() * 31);
    }

    public final String toString() {
        return "PinCodeChanged(pin=" + this.f37924a + ", action=" + this.b + Separators.RPAREN;
    }
}
