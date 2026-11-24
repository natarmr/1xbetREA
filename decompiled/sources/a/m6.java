package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21241a;
    public final wdr b;

    public m6(String str, wdr wdrVar) {
        this.f21241a = str;
        this.b = wdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return Intrinsics.d(this.f21241a, m6Var.f21241a) && Intrinsics.d(this.b, m6Var.b);
    }

    public final int hashCode() {
        String str = this.f21241a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        wdr wdrVar = this.b;
        return iHashCode + (wdrVar != null ? wdrVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f21241a + ", action=" + this.b + Separators.RPAREN;
    }
}
