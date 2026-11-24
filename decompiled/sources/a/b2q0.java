package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b2q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1866a;
    public final a2q0 b;

    public b2q0(String str, a2q0 a2q0Var) {
        str.getClass();
        this.f1866a = str;
        this.b = a2q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2q0)) {
            return false;
        }
        b2q0 b2q0Var = (b2q0) obj;
        return Intrinsics.d(this.f1866a, b2q0Var.f1866a) && this.b.equals(b2q0Var.b);
    }

    public final int hashCode() {
        return (this.f1866a.hashCode() * 31) - 342991813;
    }

    public final String toString() {
        return "TestToolsDataUiModel(stateText=" + this.f1866a + ", state=" + this.b + Separators.RPAREN;
    }
}
